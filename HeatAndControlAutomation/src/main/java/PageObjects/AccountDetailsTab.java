package PageObjects;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonutilities.ReusableUtility;

public class AccountDetailsTab extends ReusableUtility{
	
	WebDriver driver;
	String actualcontactemail;
	String actualtradename;
	String actualindustry;
	By waitforelementtodisappear;
	String actualaccountname;
	String actualparentaccount;
	String actualtype;
	String actualdescription;
	String actualaccountcurrency;
	String actualphone;
	boolean tradenamepresent;
	boolean activepresent;
	boolean customerportalaccountpresent;
	boolean websitepresent;
	boolean languagepresent;
	boolean operatinghourspresent;
	boolean employeespresent;
	boolean regionalsettingspresent;
	boolean superregionpresent;
	boolean saleschannelpresent;
	
	public AccountDetailsTab(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	
	
public void clickcontactdetailsTab() throws InterruptedException
	{
		Thread.sleep(0,2000);
		waitforelementtodisappear = waitForElementToDisAppear(By.xpath("//span[contains(@class,'toastMessage')]//a//div"));
		Thread.sleep(0,2000);
		driver.findElement(By.xpath("//ul//li//a[text()='Details']")).click();
		Thread.sleep(1000);
	}

public boolean isTradeNamePresent() throws InterruptedException
{
	Thread.sleep(0,1000);
	tradenamepresent = driver.findElement(By.xpath("//span[text()='Trade Name']")).isDisplayed();
	Thread.sleep(1000);
   return tradenamepresent;
}

public boolean isActivePresent() throws InterruptedException
{
	Thread.sleep(0,1000);
	activepresent = driver.findElement(By.xpath("(//span[text()='Active'])[1]")).isDisplayed();
	Thread.sleep(1000);
   return activepresent;
}

public boolean isCustomerPortalAccountPresent() throws InterruptedException
{
	Thread.sleep(0,1000);
	customerportalaccountpresent = driver.findElement(By.xpath("(//span[text()='Customer Portal Account'])[1]")).isDisplayed();
	Thread.sleep(1000);
   return customerportalaccountpresent;
}

public boolean isWebsitePresent() throws InterruptedException
{
	Thread.sleep(0,1000);
	websitepresent = driver.findElement(By.xpath("//span[text()='Website']")).isDisplayed();
	Thread.sleep(1000);
   return websitepresent;
}

public boolean islanguagePresent() throws InterruptedException
{
	Thread.sleep(0,1000);
	languagepresent = driver.findElement(By.xpath("(//span[text()='Language'])")).isDisplayed();
	Thread.sleep(1000);
   return languagepresent;
}

public boolean isOperatingHoursPresent() throws InterruptedException
{
	Thread.sleep(0,1000);
	operatinghourspresent = driver.findElement(By.xpath("//span[text()='Operating Hours']")).isDisplayed();
	Thread.sleep(1000);
   return operatinghourspresent;
}


public boolean isEmployeesPresent() throws InterruptedException
{
	Thread.sleep(0,1000);
	employeespresent = driver.findElement(By.xpath("//span[text()='Employees']")).isDisplayed();
	Thread.sleep(1000);
   return employeespresent;
}

public boolean isRegionalSettingsPresent() throws InterruptedException
{
	Thread.sleep(0,1000);
	regionalsettingspresent = driver.findElement(By.xpath("(//span[text()='Regional Settings'])[2]")).isDisplayed();
	Thread.sleep(1000);
   return regionalsettingspresent;
}

public boolean isSuperRegionPresent() throws InterruptedException
{
	Thread.sleep(0,1000);
	superregionpresent = driver.findElement(By.xpath("//span[text()='Super Region']")).isDisplayed();
	Thread.sleep(1000);
   return superregionpresent;
}

public boolean isSalesChannelPresent() throws InterruptedException
{
	Thread.sleep(0,1000);
	saleschannelpresent = driver.findElement(By.xpath("//span[text()='Sales Channel']")).isDisplayed();
	Thread.sleep(1000);
   return saleschannelpresent;
}

public String getTradeName() throws InterruptedException
{
	Thread.sleep(0,1000);
	actualtradename= driver.findElement(By.xpath("//span[text()='Trade Name']/../../..//lightning-formatted-text")).getText();
	Thread.sleep(1000);
   return actualtradename;
}

public String getIndustry() throws InterruptedException
{
	Thread.sleep(0,1000);
	actualindustry= driver.findElement(By.xpath("//span[text()='Industry']/../../..//lightning-formatted-text")).getText();
	Thread.sleep(1000);
   return actualindustry;
}

public String getAccountName() throws InterruptedException
{
	Thread.sleep(0,1000);
	actualaccountname= driver.findElement(By.xpath("//span[text()='Account Name']/../../..//lightning-formatted-text")).getText();
	Thread.sleep(1000);
   return actualaccountname;
}

public String getParentAccount() throws InterruptedException
{
	Thread.sleep(0,1000);
	actualparentaccount= driver.findElement(By.xpath("(//span[text()='Parent Account']/../../..//a//slot)[2]")).getText();
	Thread.sleep(1000);
   return actualparentaccount;
}



public String getType() throws InterruptedException
{
	Thread.sleep(0,1000);
	actualtype= driver.findElement(By.xpath("//span[text()='Type']/../../..//lightning-formatted-text")).getText();
	Thread.sleep(1000);
   return actualtype;
}

public String getDescription() throws InterruptedException
{
	Thread.sleep(0,1000);
	actualdescription= driver.findElement(By.xpath("//span[text()='Description']/../../..//lightning-formatted-text")).getText();
	Thread.sleep(1000);
   return actualdescription;
}

public String getAccountCurrency() throws InterruptedException
{
	Thread.sleep(0,1000);
	actualaccountcurrency= driver.findElement(By.xpath("//span[text()='Account Currency']/../../..//lightning-formatted-text")).getText();
	Thread.sleep(1000);
   return actualaccountcurrency;
}


public String getPhone() throws InterruptedException
{
	Thread.sleep(0,1000);
	actualphone= driver.findElement(By.xpath("//span[text()='Phone']/../../..//lightning-formatted-text")).getText();
	Thread.sleep(1000);
   return actualphone;
}

public String getactualcontactemail() throws InterruptedException
{
	Thread.sleep(0,1000);
	actualcontactemail= driver.findElement(By.xpath("//span[text()='Email']/../../..//emailui-formatted-email-wrapper//a")).getText();
	Thread.sleep(1000);
   return actualcontactemail;
}


public String getbillingAddress() throws InterruptedException {
	Thread.sleep(0,1000);
	scroolByPixelValue(0, 600);
	Thread.sleep(1000);
	String billingaddress = driver.findElement(By.xpath("//span[text()='Billing Address']/../../..//a")).getText();
	Thread.sleep(1000);
	return billingaddress;
	
}

public boolean verifybillingAddress() throws InterruptedException {
	
	String billingaddress = getbillingAddress();
	String formattedbillingaddress = billingaddress.replace("\n", "");
	if (formattedbillingaddress.contains("14287 Misty Meadow LnHouston, 77079United States")) {
		return true;
	} 
	else {
		return false;
}
}  
}                              
        



