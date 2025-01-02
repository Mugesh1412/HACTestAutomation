package DemoHooks;


	import java.io.IOException;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;

import DemoTestComponents.DemoBase;
import PageObjects.Login;
	import PageObjects.SelectApplication;
	import io.cucumber.java.After;
	import io.cucumber.java.Before;
	import io.cucumber.java.Scenario;
	import testcomponents.BaseTest;

	public class DemoHookClass extends DemoBase{
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

	  @After
	  public void tearDown(Scenario sc) {
		    
		  if (sc.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(screenshot, "image/png", sc.getName());
		}
		  
		 
		//  tearDownDriver(); 
	  }  
	     
	 

	}



