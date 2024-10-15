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

public class ContactListViews extends ReusableUtility{
	
	WebDriver driver;
	WebElement webele;
	String actualcontactemail;
	String actualtradename;
	String actualindustry;
	By waitforelementtoappear;
	boolean customercontaclsviewtpresent;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public ContactListViews(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
public void clickcontactdetailsTab() throws InterruptedException
	{
		Thread.sleep(0,2000);
		waitforelementtoappear = waitForElementToAppear(By.xpath("//span[contains(@class,'toastMessage')]//a//div"));
		Thread.sleep(0,2000);
		driver.findElement(By.xpath("//ul//li//a[text()='Details']")).click();
		Thread.sleep(1000);
	}

public void clickContactsTab() throws InterruptedException {
	js = (JavascriptExecutor) driver;
	Thread.sleep(0,4000);
	waitForElementToAppear(By.xpath("//a[@title='Contacts']"));
	Thread.sleep(0,3000);
	webele = driver.findElement(By.xpath("//a[@title='Contacts']"));
	js.executeScript("arguments[0].click();", webele);
	Thread.sleep(0,3000);
}

public void clickContactLisViewButton() throws InterruptedException {
	Thread.sleep(0,2000);
	driver.findElement(By.xpath("//button[@title='Select a List View: Contacts']")).click();
	Thread.sleep(4000);
}

public void clickCustomerContactsListView() throws InterruptedException {
	Thread.sleep(0,2000);
	driver.findElement(By.xpath("//li//span[text()='Customer Contacts']")).click();
	Thread.sleep(4000);
}

public boolean isCustomerContactListViewPresent() throws InterruptedException {
	Thread.sleep(0,2000);
	customercontaclsviewtpresent = driver.findElement(By.xpath("//li//span[text()='Customer Contacts']")).isDisplayed();
	Thread.sleep(4000);
	return customercontaclsviewtpresent;
}

public boolean isCustomerContactListViewNameColPresent() throws InterruptedException {
	Thread.sleep(0,2000);
	customercontaclsviewtpresent = driver.findElement(By.xpath("//a//span[@title='Name']")).isDisplayed();
	Thread.sleep(4000);
	return customercontaclsviewtpresent;
}

public boolean isCustomerContactListViewTitleColPresent() throws InterruptedException {
	Thread.sleep(0,2000);
	customercontaclsviewtpresent = driver.findElement(By.xpath("//a//span[@title='Title']")).isDisplayed();
	Thread.sleep(4000);
	return customercontaclsviewtpresent;
}

public boolean isCustomerContactListViewAccountNameColPresent() throws InterruptedException {
	Thread.sleep(0,2000);
	customercontaclsviewtpresent = driver.findElement(By.xpath("//a//span[@title='Account Name']")).isDisplayed();
	Thread.sleep(4000);
	return customercontaclsviewtpresent;
}

public boolean isCustomerContactListViewPhoneColPresent() throws InterruptedException {
	Thread.sleep(0,2000);
	customercontaclsviewtpresent = driver.findElement(By.xpath("//a//span[@title='Phone']")).isDisplayed();
	Thread.sleep(4000);
	return customercontaclsviewtpresent;
}

public boolean isCustomerContactListViewMobileColPresent() throws InterruptedException {
	Thread.sleep(0,2000);
	customercontaclsviewtpresent = driver.findElement(By.xpath("//a//span[@title='Mobile']")).isDisplayed();
	Thread.sleep(4000);
	return customercontaclsviewtpresent;
}

public boolean isCustomerContactListViewPrefPhoneColPresent() throws InterruptedException {
	Thread.sleep(0,2000);
	customercontaclsviewtpresent = driver.findElement(By.xpath("//a//span[@title='Preferred Phone']")).isDisplayed();
	Thread.sleep(4000);
	return customercontaclsviewtpresent;
}

public boolean isCustomerContactListViewEmailColPresent() throws InterruptedException {
	Thread.sleep(0,2000);
	customercontaclsviewtpresent = driver.findElement(By.xpath("//a//span[@title='Email']")).isDisplayed();
	Thread.sleep(4000);
	return customercontaclsviewtpresent;
}

public boolean isCustomerContactListViewMailingCityColPresent() throws InterruptedException {
	Thread.sleep(0,2000);
	customercontaclsviewtpresent = driver.findElement(By.xpath("//a//span[@title='Mailing City']")).isDisplayed();
	Thread.sleep(4000);
	return customercontaclsviewtpresent;
}
public boolean isCustomerContactListViewShiftColPresent() throws InterruptedException {
	Thread.sleep(0,2000);
	customercontaclsviewtpresent = driver.findElement(By.xpath("//a//span[@title='Shift']")).isDisplayed();
	Thread.sleep(4000);
	return customercontaclsviewtpresent;
}

public boolean isCustomerContactListViewLocationColPresent() throws InterruptedException {
	Thread.sleep(0,2000);
	customercontaclsviewtpresent = driver.findElement(By.xpath("//a//span[@title='Location']")).isDisplayed();
	Thread.sleep(4000);
	return customercontaclsviewtpresent;
}

public boolean isHeatandControlBillingContactsListViewPresent() throws InterruptedException {
	Thread.sleep(0,2000);
	customercontaclsviewtpresent = driver.findElement(By.xpath("//li//span[text()='Heat and Control Billing Contacts']")).isDisplayed();
	Thread.sleep(4000);
	return customercontaclsviewtpresent;
}
public boolean isHeatandControlSalesContactsListViewPresent() throws InterruptedException {
	Thread.sleep(0,2000);
	customercontaclsviewtpresent = driver.findElement(By.xpath("//li//span[text()='Heat and Control Sales Contacts']")).isDisplayed();
	Thread.sleep(4000);
	return customercontaclsviewtpresent;
}

public boolean isVendorContactsListViewPresent() throws InterruptedException {
	Thread.sleep(0,2000);
	customercontaclsviewtpresent = driver.findElement(By.xpath("//li//span[text()='Vendor Contacts']")).isDisplayed();
	Thread.sleep(4000);
	return customercontaclsviewtpresent;
}

}

