package DemoStepDefinitions;

import java.io.IOException;

import DemoPageObjects.DemoSelect;
import DemoPageObjects.login;
import DemoTestComponents.DemoBase;
import PageObjects.Login;
import PageObjects.SelectApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Demo2 extends DemoBase{
	
	@Given("Demo2 user enters {string} and {string}")
	public void demo2_user_enters_and(String userName, String password) throws IOException {
	    
		login Lp = new login(driver);
		Lp.goTo(getParameters().getProperty("DemoURL")); 
		Lp.LoginApp (userName, password); 
		
	}

	@When("Demo2 select the applicaton")
	public void demo2_select_the_applicaton() throws InterruptedException, IOException {
		DemoSelect Ds = new DemoSelect(driver);
		  Ds.selectApp(getParameters().getProperty("DemoApp")); 
		  }


	@When("Demo2 close all the open tabs")
	public void demo2_close_all_the_open_tabs() throws InterruptedException {
		closeAllTabs(); 
	}

	@When("Demo2 close the bottom bar")
	public void demo2_close_the_bottom_bar() throws InterruptedException {
		closeBottomeBar();

	}
	
	@When("logout the Application")
	public void logout_the_application() throws InterruptedException {
		login Lp = new login(driver);
		Lp.Logout();
		
		
	}
	
	





}
