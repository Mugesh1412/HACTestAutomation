package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonutilities.ReusableUtility;

public class GlobalSearch extends ReusableUtility{
	
	WebDriver driver;
	String actualcontactemail;
	String actualcontactname;
	By waitforelementtodisappear;
	
	public GlobalSearch(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	
	
public void selectaccountfromglobalsearch() throws InterruptedException
	{
		Thread.sleep(2000);
	//	waitforelementtodisappear = waitForElementToDisAppear(By.xpath("//span[contains(@class,'toastMessage')]//a//div"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Search...']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='search' and @placeholder='Search...']")).sendKeys("Test Customer Account11");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@title='Test Customer Account11'])")).click();
		Thread.sleep(5000);
		//waitforelementtodisappear = waitForElementToAppear(By.xpath("(//a[text()='Details'])[2]"));
			
	}


public void selectcasefromglobalsearch(String tstcase) throws InterruptedException
{
	Thread.sleep(2000);
//	waitforelementtodisappear = waitForElementToDisAppear(By.xpath("//span[contains(@class,'toastMessage')]//a//div"));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Search...']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='search' and @placeholder='Search...']")).sendKeys(tstcase);
	Thread.sleep(3000);
	//driver.findElement(By.xpath("(//*[@title='00001497'])[1]")).click();
	driver.findElement(By.xpath("//span//mark[text()='"+tstcase+"']")).click();
	Thread.sleep(2000);
	waitforelementtodisappear = waitForElementToAppear(By.xpath("//li//a[text()='Details']"));
	Thread.sleep(2000);	
}




}

