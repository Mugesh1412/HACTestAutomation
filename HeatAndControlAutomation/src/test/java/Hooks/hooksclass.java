package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
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
import org.testng.annotations.Test;

import PageObjects.Login;
import PageObjects.SelectApplication;

public class hooksclass extends BaseTest{
	Login loginPO;
	SelectApplication selectApplication;

@Before(order=1)
public void setUp() throws IOException 
{
	intializeDriver(); 
}
	
/*
 * @Before(order=2) public void user_enters_username_and_password() throws
 * IOException { loginPO = new LoginIntoSalesConsole(driver);
 * loginPO.goTo(getParameters().getProperty("HAC_URL")); loginPO.LoginApp (
 * getParameters().getProperty("SERVICE_REP_USER_NAME"),
 * getParameters().getProperty("SERVICE_REP_PASSWORD") ); }
 * 
 * @Before(order=3) public void select_the_applicaton() throws
 * InterruptedException, IOException { selectApplication = new
 * SelectApplication(driver);
 * selectApplication.selectApp(getParameters().getProperty("APPNAME")); }
 * 
 * @Before(order=4) public void close_all_the_open_tabs() throws
 * InterruptedException { closeAllTabs(); }
 * 
 * @Before(order=5) public void close_the_bottom_bar() throws
 * InterruptedException { closeBottomeBar(); }
 */	
/*
 * @After() public void tearDown() { tearDownDriver(); }
 */

}
