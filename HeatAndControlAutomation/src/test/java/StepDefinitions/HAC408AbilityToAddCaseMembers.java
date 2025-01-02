package StepDefinitions;

import java.io.IOException;

import PageObjects.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testcomponents.BaseTest;

public class HAC408AbilityToAddCaseMembers extends BaseTest{
	
	@Given("HAC408 user enters {string} and {string}")
	public void HAC408_user_enters_and(String userName, String password) throws IOException {
		
		Login loginPO = new Login(driver);
		loginPO.goTo(getParameters().getProperty("HAC_URL")); 
		loginPO.LoginApp (userName, password); 
	    
	   
	}

	@When("HAC408 select the applicaton")
	public void HAC408_select_the_applicaton() {
	    
	   
	}

	@When("HAC408 close all the open tabs")
	public void HAC408_close_all_the_open_tabs() {
	    
	   
	}

	@When("HAC408 close the bottom bar")
	public void HAC408_close_the_bottom_bar() {
	    
	   
	}

	@When("HAC408 user is on exsiting case record")
	public void HAC408_user_is_on_exsiting_case_record() {
	    
	   
	}

	@Then("HAC408 verify Case Team section on the case details Tab")
	public void HAC408_verify_case_team_section_on_the_case_details_tab() {
	    
	   
	}

	@Then("HAC408 verify Case Team Members Role")
	public void HAC408_verify_case_team_members_role() {
	    
	   
	}

	@Then("HAC408 Add Member on the case team section")
	public void HAC408_add_member_on_the_case_team_section() {
	    
	   
	}

	@Then("HAC408 Remove Member on the case team section")
	public void HAC408_remove_member_on_the_case_team_section() {
	    
	   
	}

}
