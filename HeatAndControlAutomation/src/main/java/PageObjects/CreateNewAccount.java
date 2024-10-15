package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonutilities.ReusableUtility;

public class CreateNewAccount extends ReusableUtility {


	@FindBy(xpath = "//a[@title='Accounts']")
	private WebElement AccountTab;

	@FindBy(xpath = "//div[text()='New']")
	private WebElement NewButton;

	@FindBy(xpath = "//span[text()='Next']")
	private WebElement NextButton;

	@FindBy(xpath = "//label[text()='Account Name']/..//div")
	private WebElement AccountnameInput;

	@FindBy(xpath = "(//button[@title='Move to Chosen'])[1]\"")
	private WebElement MoveSelectionToChosenButton;

	@FindBy(xpath = "//legend[text()='Shipping Address']/..//input[@placeholder='Search Address']")
	private WebElement AddressSearchButton;

	@FindBy(xpath = "//lightning-base-combobox-formatted-text")
	private WebElement selectAddress;

	@FindBy(xpath = "//ul[@class='slds-button-group-row']//li[3]")
	private WebElement SaveButton;



	WebDriver driver;
	public CreateNewAccount(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public void ClickcOnAccountTab() throws InterruptedException {

		Thread.sleep(0,2000);
		// WebElement AccountTab = driver.findElement(By.xpath("//a[@title='Accounts']"));
		javaScriptClick(AccountTab);
		Thread.sleep(2000);
	}

	public void ClickOnNewButtonAndClickNext() throws InterruptedException {

		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[text()='New']")).click();
		//driver.findElement(By.xpath("//span[text()='Next']")).click();
		NewButton.click();
		NextButton.click();

		Thread.sleep(2000);

	}

	public void AddAccountName(String Accountname) throws InterruptedException {

		Thread.sleep(2000);
		//driver.findElement(By.xpath("//label[text()='Account Name']/..//div")).sendKeys(Accountname);
		AccountnameInput.sendKeys(Accountname);

	}

	public void selectIndustry(String Industry) throws InterruptedException {

		WebElement industryWebelement = driver.findElement(By.xpath("//div[text()='Industry']/..//li//span[text()='"+ Industry +"']"));
		javaScriptClick(industryWebelement);

		WebElement MoveSelectionToChosenButton=driver.findElement(By.xpath("(//button[@title='Move to Chosen'])[1]"));
		javaScriptClick(MoveSelectionToChosenButton);


		Thread.sleep(2000);

	}

	public void selectAddress(String Address) throws InterruptedException {
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//legend[text()='Shipping Address']/..//input)[1]")).sendKeys(Address);
		//driver.findElement(By.xpath("//lightning-base-combobox-formatted-text")).click();

		AddressSearchButton.sendKeys(Address);
		selectAddress.click();		
	}


	public void clickOnSaveButton() throws InterruptedException {
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//ul[@class='slds-button-group-row']//li[3]")).click();
		SaveButton.click();

	}

	public boolean compareShippingAddressAndBillingAddress() throws InterruptedException {
		/*
		 * Thread.sleep(10000); scroolByPixelValue(0, 600); Thread.sleep(1000); String
		 * BillingAddress =
		 * driver.findElement(By.xpath("//span[text()='Billing Address']/../../..//a")).
		 * getText(); String shippingAddress =
		 * driver.findElement(By.xpath("//span[text()='Shipping Address']/../../..//a"))
		 * .getText(); System.out.println(BillingAddress);
		 * System.out.println(shippingAddress); String formattedbillingaddress =
		 * BillingAddress.replace("\n", "").trim(); String formattedshippingaddress =
		 * shippingAddress.replace("\n", "").trim();
		 * System.out.println(formattedshippingaddress);
		 * System.out.println(formattedbillingaddress); if
		 * (formattedshippingaddress.contains(formattedbillingaddress)) {
		 * System.out.println("true"); return true; } else {
		 * System.out.println("false"); return false; }
		 */
		
		Thread.sleep(10000);
		scroolByPixelValue(0, 600);
		Thread.sleep(1000);

		// Fetch addresses
		String BillingAddress = driver.findElement(By.xpath("//span[text()='Billing Address']/../../..//a")).getText();
		String shippingAddress = driver.findElement(By.xpath("//span[text()='Shipping Address']/../../..//a")).getText();

		// Print original addresses
		System.out.println("Original Billing Address: " + BillingAddress);
		System.out.println("Original Shipping Address: " + shippingAddress);

		// Normalize addresses by removing whitespace, commas, and making them lowercase
		String formattedBillingAddress = BillingAddress.replaceAll("[^a-zA-Z0-9]", "").trim().toLowerCase();
		String formattedShippingAddress = shippingAddress.replaceAll("[^a-zA-Z0-9]", "").trim().toLowerCase();

		// Print normalized addresses for debugging
		System.out.println("Formatted Billing Address: [" + formattedBillingAddress + "]");
		System.out.println("Formatted Shipping Address: [" + formattedShippingAddress + "]");

		// Compare key parts of the addresses (ignoring state differences)
		if (formattedBillingAddress.contains(formattedShippingAddress)) {
		    System.out.println("true");
		    return true;
		} else {
		    System.out.println("false");
		    return false;
		}

               

	}





}
