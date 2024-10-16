package PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import commonutilities.ReusableUtility;

public class HomePage extends ReusableUtility {

	WebDriver driver;
	By waitforelementtodisappear;
	By waitforelementtoappear;
	String actualmessage;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement webele;
	WebElement caseorigin;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickCasesTab() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(0, 4000);
		waitForElementToAppear(By.xpath("//a[@title='Cases']"));
		Thread.sleep(0, 3000);
		webele = driver.findElement(By.xpath("//a[@title='Cases']"));
		js.executeScript("arguments[0].click();", webele);
		Thread.sleep(0, 3000);
	}

	public void createNewCase(String contname, String firstname, String sub) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(0, 4000);
		waitForElementToAppear(By.xpath("//a//div[text()='New']"));
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//a//div[text()='New']")).click();
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//*[@field-label='Contact Name']//input")).click();
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//*[@field-label='Contact Name']//input")).sendKeys(contname);
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//ul//li//*[text()='" + firstname + "']")).click();
		Thread.sleep(0, 3000);
		// scroll to Type field
		js.executeScript(
				"var result = document.evaluate(\"//label[text()='Sales Order']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		Thread.sleep(0, 5000);

		driver.findElement(By.xpath("//*[@field-label='Type']//button[@aria-label='Type']")).click();
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//span[@title='Billing']")).click();
		Thread.sleep(0, 3000);

		driver.findElement(By.xpath("//span[@title='Billing Dispute']")).click();
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//button[@title='Move to Chosen']")).click();
		Thread.sleep(0, 3000);

		caseorigin = driver.findElement(By.xpath("(//button[@aria-label='Case Origin'])"));
		js.executeScript("arguments[0].click();", caseorigin);

		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//span[@title='Email']")).click();
		Thread.sleep(0, 4000);

		// scroll to Subject field
		js.executeScript(
				"var result = document.evaluate(\"//label[text()='Case Origin']\", document.body, null, XPathResult.ANY_TYPE, null);var input = result.iterateNext();input.scrollIntoView();");
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//label[text()='Subject']/../..//input")).click();
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//label[text()='Subject']/../..//input")).sendKeys(sub);

		driver.findElement(By.xpath("//label[text()='Description']")).click();
		Thread.sleep(0, 3000);

		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(0, 5000);
		waitForElementToAppear(By.xpath("//a[text()='Details']"));
		Thread.sleep(0, 2000);
	}

	public void ClickcOnAccountTab() throws InterruptedException {

		Thread.sleep(0, 2000);
		WebElement AccountTab = driver.findElement(By.xpath("//a[@title='Accounts']"));
		javaScriptClick(AccountTab);
		Thread.sleep(2000);
	}

	public void createNewCustomerAccount(String Accountname, String Industry, String Address)
			throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		// NewButton.click();
		// NextButton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Account Name']/..//div")).sendKeys(Accountname);
		// AccountnameInput.sendKeys(Accountname);
		WebElement industryWebelement = driver
				.findElement(By.xpath("//div[text()='Industry']/..//li//span[text()='" + Industry + "']"));
		javaScriptClick(industryWebelement);
		WebElement MoveSelectionToChosenButton = driver.findElement(By.xpath("(//button[@title='Move to Chosen'])[1]"));
		javaScriptClick(MoveSelectionToChosenButton);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//legend[text()='Shipping Address']/..//input)[1]")).sendKeys(Address);
		driver.findElement(By.xpath("//lightning-base-combobox-formatted-text")).click();
		// AddressSearchButton.sendKeys(Address);
		// selectAddress.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='slds-button-group-row']//li[3]")).click();
		// SaveButton.click();

	}

	public boolean verifyBillingAddressOnTheAccount() throws InterruptedException {

		Thread.sleep(10000);
		scroolByPixelValue(0, 600);
		Thread.sleep(1000);
		String BillingAddress = driver.findElement(By.xpath("//span[text()='Billing Address']/../../..//a")).getText();
		String shippingAddress = driver.findElement(By.xpath("//span[text()='Shipping Address']/../../..//a"))
				.getText();
		String formattedbillingaddress = BillingAddress.replace("\n", "").trim();
		String formattedshippingaddress = shippingAddress.replace("\n", "").trim();
		if (formattedshippingaddress.contains(formattedbillingaddress)) {
			return true;
		} else {
			return false;
		}

	}

	public void VerifyAbilityToSelectMultipleIndustriesValueOnTheAccount(String Accountname, String Industry1,String Industry2) throws InterruptedException, AWTException {


		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//NewButton.click(); 
		//NextButton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Account Name']/..//div")).sendKeys(Accountname); 
		//AccountnameInput.sendKeys(Accountname);
		Thread.sleep(5000); 
		Robot robot = new Robot();
		WebElement industryWebelement = driver.findElement(By.xpath("//div[text()='Industry']/..//li//span[text()='"+Industry1 +"']")); 
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_SHIFT);
		javaScriptClick(industryWebelement);
		robot.keyRelease(KeyEvent.VK_SHIFT); 
		WebElement industryWebelement2 = driver.findElement(By.xpath("//div[text()='Industry']/..//li//span[text()='"+Industry2 +"']")); 
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_SHIFT);
		javaScriptClick(industryWebelement2);
		robot.keyRelease(KeyEvent.VK_SHIFT); 
		Thread.sleep(5000); 
		WebElement MoveSelectionToChosenButton=driver.findElement(By.xpath("(//button[@title='Move to Chosen'])[1]"));
		javaScriptClick(MoveSelectionToChosenButton); 
		Thread.sleep(2000);

		//driver.findElement(By.xpath("//ul[@class='slds-button-group-row']//li[3]")).click();
		//SaveButton.click();


		/*
		 * // Click on 'New' button Thread.sleep(2000);
		 * driver.findElement(By.xpath("//div[text()='New']")).click();
		 * driver.findElement(By.xpath("//span[text()='Next']")).click();
		 * 
		 * // Enter Account Name Thread.sleep(2000);
		 * driver.findElement(By.xpath("//label[text()='Account Name']/..//div")).
		 * sendKeys(Accountname);
		 * 
		 * // Initialize Actions class for multiple selection Actions actions = new
		 * Actions(driver);
		 * 
		 * // First industry element WebElement industryWebElement1 =
		 * driver.findElement(By.xpath("//div[text()='Industry']/..//li//span[text()='"
		 * + Industry1 + "']")); actions.click(industryWebElement1).perform();
		 * Thread.sleep(3000);
		 * 
		 * // Press CTRL key and select the second industry WebElement
		 * industryWebElement2 =
		 * driver.findElement(By.xpath("//div[text()='Industry']/..//li//span[text()='"
		 * + Industry2 + "']"));
		 * actions.keyDown(Keys.CONTROL).click(industryWebElement2).keyUp(Keys.CONTROL).
		 * perform(); // Hold CTRL to multi-select Thread.sleep(5000);
		 * 
		 * // Click the 'Move to Chosen' button WebElement moveSelectionToChosenButton =
		 * driver.findElement(By.xpath("(//button[@title='Move to Chosen'])[1]"));
		 * javaScriptClick(moveSelectionToChosenButton);
		 * 
		 * Thread.sleep(2000);
		 */      
		
		   
		    


	}
}
