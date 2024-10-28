package StepDefinitions;

import java.awt.AWTException;
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

public class HAC387AbilityToSelectMultipleIndustriesOnAccountRecord extends BaseTest {

	@Given("HAC387Multiselect user enters {string} and {string}")
	public void HAC387multiselect_user_enters_and(String username, String password) throws IOException {
		Login loginPO = new Login(driver);
		loginPO.goTo(getParameters().getProperty("HAC_URL")); 
		loginPO.LoginApp (username, password); 
	    
	}

	@When("HAC387Multiselect select the applicaton")
	public void HAC387multiselect_select_the_applicaton() throws InterruptedException, IOException {
		SelectApplication selectApplication = new SelectApplication(driver);
		selectApplication.selectApp(getParameters().getProperty("APPNAME")); 
	    
	}

	@When("HAC387Multiselect close all the open tabs")
	public void HAC387multiselect_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs(); 
	    
	}

	@When("HAC387Multiselect close the bottom bar")
	public void HAC387multiselect_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar(); 
	    
	}

	@When("HAC387Multiselect user is on account tab")
	public void HAC387multiselect_user_is_on_account_tab() throws InterruptedException {
		HomePage HomePage = new HomePage(driver);
		HomePage.ClickcOnAccountTab();
	    
	}

	@When("HAC387Multiselect User should click on the new button and enter the necessary details to create a new account- Use Below Cretancials")
	public void HAC387multiselect_user_should_click_on_the_new_button_and_enter_the_necessary_details_to_create_a_new_account_use_below_cretancials(DataTable dataTable) throws InterruptedException, AWTException {
	 
		List<Map<String, String>> value = dataTable.asMaps(String.class,String.class);
		String AccountName = value.get(0).get("Account Name");
		String industryvalue1 = value.get(0).get("Industry1");
		String industryvalue2 = value.get(0).get("Industry2");
		HomePage HomePage = new HomePage(driver);
		HomePage.VerifyAbilityToSelectMultipleIndustriesValueOnTheAccount(AccountName, industryvalue1, industryvalue2);
	    
	}

	@Then("HAC387Multiselect verify the industries value on the account record")
	public void HAC387multiselect_verify_the_industries_value_on_the_account_record() {
	 
	                                                                                                                               
	}      

}
