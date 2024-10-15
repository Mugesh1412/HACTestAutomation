package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import commonutilities.ReusableUtility;

public class EstimateCreationFlowStep3 extends ReusableUtility {

	WebDriver driver;
	By waitforelementtodisappear;
	By waitforelementtoappear;
	String actualmessage;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement webele;

	public EstimateCreationFlowStep3(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickViewConfirmation() throws InterruptedException {
		Thread.sleep(0, 2000);
		Thread.sleep(0, 2000);
		driver.findElement(By.xpath("(//button[text()='View Confirmation'])[2]")).click();
		Thread.sleep(2000);
		waitforelementtoappear = waitForElementToAppear(By.xpath("(//button[text()='Create PDF'])[1]"));
	}

	public void clickCreatePDF() throws InterruptedException {
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("(//button[text()='Create PDF'])[2]")).click();
		Thread.sleep(4000);
		// waitforelementtoappear =
		// waitForElementToAppear(By.xpath("(//button[text()='Create PDF'])[1]"));
	}

		public void clickSaveButton() throws InterruptedException {
		Thread.sleep(0, 2000);
		// waitforelementtodisappear =
		// waitForElementToDisAppear(By.xpath("//span[contains(@class,'toastMessage')]//a//div"));
		Thread.sleep(0, 2000);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(2000);
	}

	

}
