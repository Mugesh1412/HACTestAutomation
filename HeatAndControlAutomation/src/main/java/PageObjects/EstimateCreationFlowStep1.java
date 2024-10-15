package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import commonutilities.ReusableUtility;

public class EstimateCreationFlowStep1 extends ReusableUtility {

	WebDriver driver;
	By waitforelementtodisappear;
	By waitforelementtoappear;
	String actualmessage;
	boolean pricebookoption1;
	boolean pricebookoption2;
	boolean pricebookoption3;
	boolean pricebookoption4;
	boolean pricebookoption5;
	boolean pricebookoption6;
	boolean pricebookoption7;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement webele;

	public EstimateCreationFlowStep1(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickEstimatesTab() throws InterruptedException {
		Thread.sleep(0, 2000);
		// waitforelementtodisappear =
		// waitForElementToDisAppear(By.xpath("//span[contains(@class,'toastMessage')]//a//div"));
		Thread.sleep(0, 2000);
		driver.findElement(By.xpath("//li//a[text()='Estimations']")).click();
		Thread.sleep(4000);
		// waitforelementtoappear =
		// waitForElementToAppear(By.xpath("(//button[text()='View
		// Confirmation'])[1]"));
	}

	public void estimateFlowStep1(String pricebook, String estimatematrix, String estimatematrixoption,
			String estimateitem) throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(0, 4000);
		// waitForElementToAppear(By.xpath("//*[text()='Price Book']/../..//button"));
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//*[text()='Price Book']/../..//button")).click();
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//span[text()='" + pricebook + "']")).click();
		Thread.sleep(0, 3000);

		driver.findElement(By.xpath("//*[text()='" + estimatematrix + "']/../..//button")).click();
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//span[text()='" + estimatematrixoption + "']")).click();
		Thread.sleep(0, 3000);

		driver.findElement(By.xpath("//*[text()='Estimate Items']/../..//button")).click();
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//span[text()='" + estimateitem + "']")).click();
		Thread.sleep(0, 3000);

		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(0, 4000);

	}
	
	
	public boolean verifyPriceBookOption1() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		Thread.sleep(0, 4000);
		// waitForElementToAppear(By.xpath("//*[text()='Price Book']/../..//button"));
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//*[text()='Price Book']/../..//button")).click();
		Thread.sleep(0, 3000);
		pricebookoption1 =	driver.findElement(By.xpath("//span[text()='CANADA Domestic Market Rate']")).isDisplayed();
		return pricebookoption1;
		
	}
	
	
	public boolean verifyPriceBookOption2() throws InterruptedException {
		Thread.sleep(0, 3000);
		pricebookoption2 =	driver.findElement(By.xpath("//span[text()='CANADA Domestic MPA-PEPSICO (FRITOLAY)']")).isDisplayed();
		return pricebookoption2;
		
	}
	
	
	public boolean verifyPriceBookOption3() throws InterruptedException {
		Thread.sleep(0, 3000);
		pricebookoption3 =	driver.findElement(By.xpath("//span[text()='USA Domestic Market Rate']")).isDisplayed();
		return pricebookoption3;
		
	}
	
	
	public boolean verifyPriceBookOption4() throws InterruptedException {
		Thread.sleep(0, 3000);
		pricebookoption4 =	driver.findElement(By.xpath("//span[text()='USA Domestic Market Rate PRE-PAY / COD']")).isDisplayed();
		return pricebookoption4;
		
	}
	
	public boolean verifyPriceBookOption5() throws InterruptedException {
		Thread.sleep(0, 3000);
		pricebookoption5 =	driver.findElement(By.xpath("//span[text()='USA Domestic MPA-PEPSICO (FritoLay)']")).isDisplayed();
		Thread.sleep(0, 3000);
		return pricebookoption5;
		
	}
	
	public boolean verifyPriceBookOption6() throws InterruptedException {
		Thread.sleep(0, 4000);
		pricebookoption6 =	driver.findElement(By.xpath("//span[text()='USA International Market Rate']")).isDisplayed();
		Thread.sleep(0, 3000);
		return pricebookoption6;
		
	}
	
	public boolean verifyPriceBookOption7() throws InterruptedException {
		Thread.sleep(0, 3000);
		pricebookoption7 =	driver.findElement(By.xpath("//span[text()='USA International MPA-PEPSICO (FRITOLAY)']")).isDisplayed();
		Thread.sleep(0, 3000);
		driver.findElement(By.xpath("//*[text()='Price Book']/../..//button")).click();
		return pricebookoption7;
		
	}

}
