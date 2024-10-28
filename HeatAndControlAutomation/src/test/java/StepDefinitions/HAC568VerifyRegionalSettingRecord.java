package StepDefinitions;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.SelectApplication;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testcomponents.BaseTest;

public class HAC568VerifyRegionalSettingRecord extends BaseTest {
	
	public String RegionalSetting;
	
	@Given("HAC568 user enters {string} and {string}")
	public void HAC568_user_enters_and(String username, String password) throws IOException {
		Login loginPO = new Login(driver);
		loginPO.goTo(getParameters().getProperty("HAC_URL")); 
		loginPO.LoginApp (username, password); 
	   
	}
	
	@When("HAC568 select the applicaton")
	public void HAC568_select_the_applicaton() throws InterruptedException, IOException {
		SelectApplication selectApplication = new SelectApplication(driver);
		selectApplication.selectApp(getParameters().getProperty("APPNAME")); 
	   
	}
	
	@When("HAC568 close all the open tabs")
	public void HAC568_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs(); 
	   
	}
	
	@When("HAC568 close the bottom bar")
	public void HAC568_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar(); 
	   
	}
	
	@When("HAC568 user is on account tab")
	public void HAC568_user_is_on_account_tab() throws InterruptedException {
		HomePage HomePage = new HomePage(driver);
		HomePage.ClickcOnAccountTab();
	   
	}
	
	@When("HAC568 User should click on the new button and enter the necessary details to create a new account- Use Below Cretancials")
	public void HAC568_user_should_click_on_the_new_button_and_enter_the_necessary_details_to_create_a_new_account_use_below_cretancials(DataTable dataTable) throws InterruptedException {
	    
		List<Map<String, String>> value = dataTable.asMaps(String.class,String.class);
		String AccountName = value.get(0).get("Account Name");
		String Industryvalue = value.get(0).get("Industry");
		RegionalSetting = value.get(0).get("Regional Setting");
		String Address = value.get(0).get("Shipping Address");
		HomePage HomePage = new HomePage(driver);
		
		HomePage.createNewCustomerAccount(AccountName, Industryvalue, Address, RegionalSetting);
		
	   
	}
	
	@Then("HAC568 verify the regional setting value on the account record")
	public void HAC568_verify_the_regional_setting_value_on_the_account_record() throws InterruptedException {
		HomePage HomePage = new HomePage(driver);
		String actuvalValue = HomePage.verifyRegionalSettingRecordValue();
		if (actuvalValue.equals(RegionalSetting)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}     
	   
	}     

}  
