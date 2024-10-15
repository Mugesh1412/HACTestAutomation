package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import testcomponents.BaseTest;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import PageObjects.AccountDetailsTab;

import PageObjects.CreateNewContact;

import PageObjects.GlobalSearch;
import PageObjects.Login;
import PageObjects.SelectApplication;

public class HAC145VerifyAccountLayout extends BaseTest{
	AccountDetailsTab accountDetailsTab;
	GlobalSearch globalSearch;
	String industryname;
	Login loginPO;
	SelectApplication  selectApplication;
	String accountcurrency;
	String accountname;
	String type;
	String description;
	String phone;
	boolean tradenamelabel;
	boolean operatinghourslabel;
	boolean employeeslabel;
	boolean activelabel;
	boolean customerporatlaccountlabel;
	boolean superregionlabel;
	String tradename;
	String parentaccount;
	boolean saleschannellabel;
	boolean regionalsettingslabel;
	boolean languagelabel;
	boolean websitelabel;

@Given("^HAC145 user enters (.*) and (.*)$")	
public void HAC145_user_enters_username_and_password(String userName, String  password) throws  IOException { 
	loginPO = new Login(driver);
	loginPO.goTo(getParameters().getProperty("HAC_URL")); 
	loginPO.LoginApp (userName, password); 
	}

@When("HAC145 select the applicaton")
public void HAC145_select_the_applicaton() throws InterruptedException, IOException { 
	selectApplication = new SelectApplication(driver);
	  selectApplication.selectApp(getParameters().getProperty("APPNAME")); 
	  }

@When("HAC145 close all the open tabs")	  
public void HAC145_close_all_the_open_tabs() throws InterruptedException { 
	closeAllTabs(); 
	}

@When("HAC145 close the bottom bar")	  
public void HAC387_close_the_bottom_bar() throws InterruptedException { 
	closeBottomeBar(); 
	}
	 	
	
@When ("HAC145 user is on account details")
public void HAC145_user_is_on_account_details() throws InterruptedException, IOException {		
	globalSearch = new GlobalSearch(driver);
	globalSearch.selectaccountfromglobalsearch();
}

//validate account name on account details 
@Then ("HAC145 verify account name")
public void HAC145_verify_account_name() throws InterruptedException, IOException 
{		
	 accountDetailsTab = new AccountDetailsTab(driver);
	 accountname = accountDetailsTab.getAccountName();
	 Assert.assertEquals(accountname,"Test Customer Account11");
	
}

@Then ("HAC145 verify parent account")
public void HAC145_verify_parent_account() throws InterruptedException, IOException 
{		
	 accountDetailsTab = new AccountDetailsTab(driver);
	 parentaccount = accountDetailsTab.getParentAccount();
	 Assert.assertEquals(parentaccount,"Juicy Box (Sample)");
	
}

@Then ("HAC145 verify type")
public void HAC145_verify_type() throws InterruptedException, IOException 
{		
	 accountDetailsTab = new AccountDetailsTab(driver);
	 type = accountDetailsTab.getType();
	 Assert.assertEquals(type,"Customer");
	
}
//validate industry name on account details 
@Then ("HAC145 verify industry")
public void HAC145_verify_industry() throws InterruptedException, IOException 
{		
	 accountDetailsTab = new AccountDetailsTab(driver);
	 industryname = accountDetailsTab.getIndustry();
	 Assert.assertEquals(industryname,"Leafy Greens");
	
}

/*
 * @Then ("HAC145 verify description") public void HAC145_verify_description()
 * throws InterruptedException, IOException { accountDetailsTab = new
 * AccountDetailsTab(driver); description = accountDetailsTab.getDescription();
 * Assert.assertEquals(description,"Leafy Greens");
 * 
 * }
 */

@Then ("HAC145 verify account currency")
public void HAC145_verify_accountcurrency() throws InterruptedException, IOException 
{		
	 accountDetailsTab = new AccountDetailsTab(driver);
	 accountcurrency = accountDetailsTab.getAccountCurrency();
	 Assert.assertEquals(accountcurrency,"USD - U.S. Dollar");
	
}

//validate trade name label on account details 
@Then ("HAC145 verify trade name label")
public void HAC145_verify_trade_name_label() throws InterruptedException, IOException 
{		
	 accountDetailsTab = new AccountDetailsTab(driver);
	 tradenamelabel = accountDetailsTab.isTradeNamePresent();
	 Assert.assertTrue(tradenamelabel);
	
}

//validate trade name value on account details 
@Then ("HAC145 verify trade name value")
public void HAC145_verify_trade_name_value() throws InterruptedException, IOException 
{		
	 accountDetailsTab = new AccountDetailsTab(driver);
	 tradename = accountDetailsTab.getTradeName();
	 Assert.assertEquals(tradename,"Trade Name - Test Customer Account11");
	
}

//validate active label on account details 
@Then ("HAC145 verify active label")
public void HAC145_verify_active_label() throws InterruptedException, IOException 
{		
	 accountDetailsTab = new AccountDetailsTab(driver);
	 activelabel = accountDetailsTab.isActivePresent();
	 Assert.assertTrue(activelabel);
	
}

//validate customer portal account label on account details 
@Then ("HAC145 verify customer portal account label")
public void HAC145_verify_customer_portal_account_label() throws InterruptedException, IOException 
{		
	 accountDetailsTab = new AccountDetailsTab(driver);
	customerporatlaccountlabel = accountDetailsTab.isCustomerPortalAccountPresent();
	 Assert.assertTrue(customerporatlaccountlabel);
	
}

//validate Employees label on account details 
@Then ("HAC145 verify employees label")
public void HAC145_verify_employees_label() throws InterruptedException, IOException 
{		
	 accountDetailsTab = new AccountDetailsTab(driver);
	employeeslabel = accountDetailsTab.isEmployeesPresent();
	 Assert.assertTrue(employeeslabel);
	
}

//validate Operating Hours label on account details 
@Then ("HAC145 verify operating hours label")
public void HAC145_verify_operating_hours_label() throws InterruptedException, IOException 
{		
	 accountDetailsTab = new AccountDetailsTab(driver);
	operatinghourslabel = accountDetailsTab.isOperatingHoursPresent();
	 Assert.assertTrue(operatinghourslabel);
	
}

//validate Super Region label on account details 
@Then ("HAC145 verify super region label")
public void HAC145_verify_super_region_label() throws InterruptedException, IOException 
{		
	 accountDetailsTab = new AccountDetailsTab(driver);
	 superregionlabel = accountDetailsTab.isSuperRegionPresent();
	 Assert.assertTrue(superregionlabel);
	
}

//validate Sales Channel label on account details 
@Then ("HAC145 verify sales channel label")
public void HAC145_verify_sales_channel_label() throws InterruptedException, IOException 
{		
	 accountDetailsTab = new AccountDetailsTab(driver);
	 saleschannellabel = accountDetailsTab.isSalesChannelPresent();
	 Assert.assertTrue(saleschannellabel);
	
}

//validate Regional Settings label on account details 
@Then ("HAC145 verify regional settings label")
public void HAC145_verify_regional_settings_label() throws InterruptedException, IOException 
{		
	 accountDetailsTab = new AccountDetailsTab(driver);
	 regionalsettingslabel = accountDetailsTab.isRegionalSettingsPresent();
	 Assert.assertTrue(regionalsettingslabel);
	
}

//validate Language label on account details 
@Then ("HAC145 verify language label")
public void HAC145_verify_language_label() throws InterruptedException, IOException 
{		
	 accountDetailsTab = new AccountDetailsTab(driver);
	 languagelabel = accountDetailsTab.islanguagePresent();
	 Assert.assertTrue(languagelabel);
	
}

//validate Website label on account details 
@Then ("HAC145 verify website label")
public void HAC145_verify_website_label() throws InterruptedException, IOException 
{		
	 accountDetailsTab = new AccountDetailsTab(driver);
	 websitelabel = accountDetailsTab.isWebsitePresent();
	 Assert.assertTrue(websitelabel);
	
}

}
