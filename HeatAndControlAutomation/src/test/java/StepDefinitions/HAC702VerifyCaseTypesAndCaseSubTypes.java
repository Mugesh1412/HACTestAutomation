package StepDefinitions;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import PageObjects.HomePage;
import PageObjects.Login;
import PageObjects.SelectApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testcomponents.BaseTest;

public class HAC702VerifyCaseTypesAndCaseSubTypes extends BaseTest{
	
	@Given("HAC702 user enters {string} and {string}")
	public void HAC702_user_enters_and(String userName, String password) throws IOException {
		Login loginPO = new Login(driver);
		loginPO.goTo(getParameters().getProperty("HAC_URL")); 
		loginPO.LoginApp (userName, password); 
	    
	}

	@When("HAC702 select the applicaton")
	public void HAC702_select_the_applicaton() throws InterruptedException, IOException {
		SelectApplication selectApplication = new SelectApplication(driver);
		  selectApplication.selectApp(getParameters().getProperty("APPNAME")); 
	    
	}

	@When("HAC702 close all the open tabs")
	public void HAC702_close_all_the_open_tabs() throws InterruptedException {
	  closeAllTabs();
	    
	}

	@When("HAC702 close the bottom bar")
	public void HAC702_close_the_bottom_bar() throws InterruptedException {
	  closeBottomeBar();
	    
	}

	@When("HAC702 Click New Button On the case Tab")
	public void HAC702_click_new_button_on_the_case_tab() throws InterruptedException {
	  HomePage HomePage = new HomePage(driver);
	  HomePage.clickCasesTab();
	  HomePage.clickNewButtonOnCaseTab();
		
	    
	}  

	@Then("HAC702 verify case Types")
	public void HAC702_verify_case_types() {
		HomePage HomePage = new HomePage(driver);
		boolean result = HomePage.verifyCaseTypes();    
		assertTrue(result);
	              
	    }                                                                                                                                                                                                                                                        

	@Then("HAC702 verify case Sub Types")
	public void HAC702_verify_case_sub_types() throws InterruptedException {
		HomePage HomePage = new HomePage(driver);
		boolean result = HomePage.verifyAllSubTypes();
		assertTrue(result);
	}

}
