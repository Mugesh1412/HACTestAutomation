package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import commonutilities.ReusableUtility;

public class EstimateCreationFlowStep2 extends ReusableUtility {

	WebDriver driver;
	By waitforelementtodisappear;
	By waitforelementtoappear;
	boolean numberoftechpresent;
	boolean numberofdayspresent;
	boolean numberofhourspresent;
	String actualmessage;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement webele;

	public EstimateCreationFlowStep2(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectFromDate() throws InterruptedException {
		Thread.sleep(0, 2000);
		waitforelementtoappear = waitForElementToAppear(By.xpath("(//button[text()='View Confirmation'])[1]"));
		Thread.sleep(0, 4000);
		driver.findElement(By.xpath("//*[text()='From Date']/..//input")).click();
		Thread.sleep(0, 2000);
		driver.findElement(By.xpath("//tr/td[@data-value='2024-10-15']")).click();
		Thread.sleep(2000);
	}

	public void selectToDate() throws InterruptedException {
		Thread.sleep(0, 2000);
		waitforelementtoappear = waitForElementToAppear(By.xpath("(//button[text()='View Confirmation'])[1]"));
		Thread.sleep(0, 4000);
		driver.findElement(By.xpath("//*[text()='To Date']/..//input")).click();
		Thread.sleep(0, 2000);
		driver.findElement(By.xpath("//tr/td[@data-value='2024-10-20']")).click();
		Thread.sleep(3000);
	}

	public boolean isNumberOfTechPresent() throws InterruptedException {
		Thread.sleep(0, 3000);
		numberoftechpresent = driver.findElement(By.xpath("(//label[text()='Number Of Tech'])")).isDisplayed();
		Thread.sleep(1000);
		return numberoftechpresent;
	}

	public boolean isNumberOfDaysPresent() throws InterruptedException {
		Thread.sleep(0, 3000);
		numberofdayspresent = driver.findElement(By.xpath("(//label[text()='Number Of Days'])")).isDisplayed();
		Thread.sleep(1000);
		return numberofdayspresent;
	}

	public boolean isNumberOfHrsPresent() throws InterruptedException {
		Thread.sleep(0, 3000);
		numberofhourspresent = driver.findElement(By.xpath("(//label[text()='Number of Hrs/day'])")).isDisplayed();
		Thread.sleep(1000);
		return numberofhourspresent;
	}

}
