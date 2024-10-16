package StepDefinitions;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import PageObjects.CreateNewAccount;
import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.SelectApplication;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testcomponents.BaseTest;

public class HAC627VerifyNewAccountBillingAddress extends BaseTest {
	@Given("HAC627New user enters {string} and {string}")
	public void HAC627new_user_enters_and(String username, String password) throws IOException {
		Login loginPO = new Login(driver);
		loginPO.goTo(getParameters().getProperty("HAC_URL")); 
		loginPO.LoginApp (username, password); 
	}



	@When("HAC627New select the applicaton")
	public void HAC627new_select_the_applicaton() throws InterruptedException, IOException {
		SelectApplication selectApplication = new SelectApplication(driver);
		selectApplication.selectApp(getParameters().getProperty("APPNAME")); 

	}

	@When("HAC627New close all the open tabs")
	public void HAC627new_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs(); 

	}

	@When("HAC627New close the bottom bar")
	public void HAC627new_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar(); 

	}

	@When("HAC627New user is on account tab")
	public void HAC627new_user_is_on_account_tab() throws InterruptedException {
		HomePage HomePage = new HomePage(driver);
		HomePage.ClickcOnAccountTab();

	}

	

	@When("HAC627New User should click on the new button and enter the necessary details to create a new account- Use Below Cretancials")
	public void HAC627new_user_should_enter_the_necessary_details_to_create_a_new_account_use_below_cretancials(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> value = dataTable.asMaps(String.class,String.class);
		String AccountName = value.get(0).get("Account Name");
		String industryvalue = value.get(0).get("Industry");
		String Address = value.get(0).get("Shipping Address");
		HomePage HomePage = new HomePage(driver);
		
		HomePage.createNewCustomerAccount(AccountName, industryvalue, Address);


	}


	@Then("HAC627New Compare the shipping Address and billing Address on the account record")
	public void HAC627new_compare_the_shipping_address_and_billing_address_on_the_account_record() throws InterruptedException {
		HomePage HomePage = new HomePage(driver);
		boolean result = HomePage.verifyBillingAddressOnTheAccount();
		if (result==true) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}            
	}
                              
     
}      
