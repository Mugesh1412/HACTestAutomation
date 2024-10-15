//this class is unused
package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContact {
	
	WebDriver driver;
	
	public CreateNewContact(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//ul[@class='slds-global-actions']//a[.//span[text()='Global Actions']]")
	WebElement globalactions;
	
	@FindBy(xpath="//ul[@class='slds-global-actions']//a[@title='New Contact']")
	WebElement newtaskclick;
	
	
public void createNewContact(String contactfirstname,String contactlastname, String email) throws InterruptedException
	{
		Thread.sleep(0,1000);
		globalactions.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    newtaskclick.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    driver.findElement(By.xpath("//label//span[text()='First Name']/../..//input")).sendKeys(contactfirstname);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("//label//span[text()='Last Name']/../..//input")).sendKeys(contactlastname);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("//label//span[text()='Email']/../..//input")).sendKeys(email);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//span[text()='Save'])[last()]")) .click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]//a//div")).click();
	}
}

