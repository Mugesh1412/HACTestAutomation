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
import PageObjects.ContactListViews;
import PageObjects.CreateNewContact;

import PageObjects.GlobalSearch;
import PageObjects.Login;
import PageObjects.SelectApplication;

public class HAC1124VerifyContactListViews extends BaseTest{
	AccountDetailsTab accountDetailsTab;
	ContactListViews contactlistviews;
	GlobalSearch globalSearch;
	String industryname;
	Login loginPO;
	SelectApplication  selectApplication;



@Given("^HAC1124 user enters (.*) and (.*)$")	
public void HAC1124_user_enters_username_and_password(String userName, String  password) throws  IOException { 
	loginPO = new Login(driver);
	loginPO.goTo(getParameters().getProperty("HAC_URL")); 
	loginPO.LoginApp (userName, password); 
	}

@When("HAC1124 select the applicaton")
public void HAC1124_select_the_applicaton() throws InterruptedException, IOException { 
	selectApplication = new SelectApplication(driver);
	  selectApplication.selectApp(getParameters().getProperty("APPNAME")); 
	  }

@When("HAC1124 close all the open tabs")	  
public void HAC1124_close_all_the_open_tabs() throws InterruptedException { 
	closeAllTabs(); 
	}

@When("HAC1124 close the bottom bar")	  
public void HAC387_close_the_bottom_bar() throws InterruptedException { 
	closeBottomeBar(); 
	}
	 	
//click on contacts tab 
@When ("HAC1124 user is on contact home page")
public void HAC1124_user_is_on_contact_home_page() throws InterruptedException, IOException {		
	contactlistviews = new ContactListViews(driver);
	contactlistviews.clickContactsTab();
}

//click on contacts list view button 
@When ("HAC1124 click on contact list view button")
public void HAC1124_click_on_contact_list_view_button() throws InterruptedException, IOException {		
	contactlistviews = new ContactListViews(driver);
	contactlistviews.clickContactLisViewButton();
}

//verify the customer contacts list views 
@Then ("HAC1124 verify the customer contact list view")
public void HAC1124_verify_the_customer_contact_list_view() throws InterruptedException, IOException {		
	contactlistviews = new ContactListViews(driver);
	Assert.assertTrue(contactlistviews.isCustomerContactListViewPresent());
}

//verify the heat and control billing contacts list views 
@Then ("HAC1124 verify the heat and control billing contacts list view")
public void HAC1124_verify_the_heat_and_control_billing_contacts_list_view() throws InterruptedException, IOException {		
	contactlistviews = new ContactListViews(driver);
	Assert.assertTrue(contactlistviews.isHeatandControlBillingContactsListViewPresent());
}

//verify the heat and control sales contacts list views 
@Then ("HAC1124 verify the heat and control sales contacts list view")
public void HAC1124_verify_the_heat_and_control_sales_contacts_list_view() throws InterruptedException, IOException {		
	contactlistviews = new ContactListViews(driver);
	Assert.assertTrue(contactlistviews.isHeatandControlSalesContactsListViewPresent());
}

//verify the vendor contacts list views 
@Then ("HAC1124 verify the vendor contacts list view")
public void HAC1124_verify_the_vendor_contacts_list_view() throws InterruptedException, IOException {		
	contactlistviews = new ContactListViews(driver);
	Assert.assertTrue(contactlistviews.isVendorContactsListViewPresent());
}

//select the customer contacts list view
@Then ("HAC1124 select the customer contacts list view")
public void HAC1124_select_the_customer_contacts_list_view() throws InterruptedException, IOException {		
	contactlistviews = new ContactListViews(driver);
	contactlistviews.clickCustomerContactsListView();
}

//verify the name column in customer contacts list views 
@Then ("HAC1124 verify the name column in customer contact list view")
public void HAC1124_verify_the_name_column_in_customer_contact_list_view() throws InterruptedException, IOException {		
	contactlistviews = new ContactListViews(driver);
	Assert.assertTrue(contactlistviews.isCustomerContactListViewNameColPresent());
}

//verify the title column in customer contacts list views 
@Then ("HAC1124 verify the title column in customer contact list view")
public void HAC1124_verify_the_title_column_in_customer_contact_list_view() throws InterruptedException, IOException {		
	contactlistviews = new ContactListViews(driver);
	Assert.assertTrue(contactlistviews.isCustomerContactListViewTitleColPresent());
}
//verify the account name column in customer contacts list views 
@Then ("HAC1124 verify the account name column in customer contact list view")
public void HAC1124_verify_the_account_name_column_in_customer_contact_list_view() throws InterruptedException, IOException {		
	contactlistviews = new ContactListViews(driver);
	Assert.assertTrue(contactlistviews.isCustomerContactListViewAccountNameColPresent());
}
//verify the phone column in customer contacts list views 
@Then ("HAC1124 verify the phone column in customer contact list view")
public void HAC1124_verify_the_phone_column_in_customer_contact_list_view() throws InterruptedException, IOException {		
	contactlistviews = new ContactListViews(driver);
	Assert.assertTrue(contactlistviews.isCustomerContactListViewPhoneColPresent());
}

//verify the mobile column in customer contacts list views 
@Then ("HAC1124 verify the mobile column in customer contact list view")
public void HAC1124_verify_the_mobile_column_in_customer_contact_list_view() throws InterruptedException, IOException {		
	contactlistviews = new ContactListViews(driver);
	Assert.assertTrue(contactlistviews.isCustomerContactListViewMobileColPresent());
}

//verify the preferred phone column in customer contacts list views 
@Then ("HAC1124 verify the preferred phone column in customer contact list view")
public void HAC1124_verify_the_preferred_phone_column_in_customer_contact_list_view() throws InterruptedException, IOException {		
	contactlistviews = new ContactListViews(driver);
	Assert.assertTrue(contactlistviews.isCustomerContactListViewPrefPhoneColPresent());
}

//verify the email column in customer contacts list views 
@Then ("HAC1124 verify the email column in customer contact list view")
public void HAC1124_verify_the_email_column_in_customer_contact_list_view() throws InterruptedException, IOException {		
	contactlistviews = new ContactListViews(driver);
	Assert.assertTrue(contactlistviews.isCustomerContactListViewEmailColPresent());
}

//verify the mailing city column in customer contacts list views 
@Then ("HAC1124 verify the mailing city column in customer contact list view")
public void HAC1124_verify_the_mailing_city_column_in_customer_contact_list_view() throws InterruptedException, IOException {		
	contactlistviews = new ContactListViews(driver);
	Assert.assertTrue(contactlistviews.isCustomerContactListViewMailingCityColPresent());
}

//verify the shift column in customer contacts list views 
@Then ("HAC1124 verify the shift column in customer contact list view")
public void HAC1124_verify_the_shift_column_in_customer_contact_list_view() throws InterruptedException, IOException {		
	contactlistviews = new ContactListViews(driver);
	Assert.assertTrue(contactlistviews.isCustomerContactListViewShiftColPresent());
}
//verify the location column in customer contacts list views 
@Then ("HAC1124 verify the location column in customer contact list view")
public void HAC1124_verify_the_location_column_in_customer_contact_list_view() throws InterruptedException, IOException {		
	contactlistviews = new ContactListViews(driver);
	Assert.assertTrue(contactlistviews.isCustomerContactListViewLocationColPresent());
}


}
