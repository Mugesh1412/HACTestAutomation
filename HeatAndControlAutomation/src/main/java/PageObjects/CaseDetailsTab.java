package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import commonutilities.ReusableUtility;

public class CaseDetailsTab extends ReusableUtility {

	WebDriver driver;
	By waitforelementtodisappear;
	By waitforelementtoappear;
	boolean numberoftechpresent;
	boolean numberofdayspresent;
	boolean numberofhourspresent;
	String actualmessage;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement webele;

	public CaseDetailsTab(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void editCaseStatus() throws InterruptedException {
		Thread.sleep(0, 2000);
		// waitforelementtodisappear =
		// waitForElementToDisAppear(By.xpath("//span[contains(@class,'toastMessage')]//a//div"));
		Thread.sleep(0, 2000);
		driver.findElement(By.xpath("//span[text()='Edit Status']/..")).click();
		Thread.sleep(2000);
	}

	public void updateCaseStatusNew() throws InterruptedException {
		Thread.sleep(0, 2000);
		// waitforelementtodisappear =
		// waitForElementToDisAppear(By.xpath("//span[contains(@class,'toastMessage')]//a//div"));
		Thread.sleep(0, 2000);
		driver.findElement(By.xpath("//button[@aria-label='Status']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title='Escalated']")).click();
		Thread.sleep(2000);
	}

	public void clickSaveButton() throws InterruptedException {
		Thread.sleep(0, 2000);
		// waitforelementtodisappear =
		// waitForElementToDisAppear(By.xpath("//span[contains(@class,'toastMessage')]//a//div"));
		Thread.sleep(0, 2000);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(2000);
	}

	public String getValidationMessage() throws InterruptedException {
		Thread.sleep(0, 1000);
		actualmessage = driver.findElement(By.xpath(
				"//*[text()='This case has been closed for more than 14 days.  Please open a new case and link the two if desired']"))
				.getText();
		Thread.sleep(1000);
		return actualmessage;
	}

}
