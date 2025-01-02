package DemoRunner;


	


	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions
			(
			tags="@mugesh", 
			features = "src/test/java/DemoFeature",
			glue = {"DemoStepDefinitions","DemoHooks"},
			dryRun= !true,
			plugin = {
					"pretty",	
					"json:target/jsonreport.json",
					"html:target/htmlreport.html",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
					}
			)
//		"html:target/htmlreport.html",

	public class DemoRunner  extends AbstractTestNGCucumberTests {

		/*
		 * @Override
		 * 
		 * @DataProvider(parallel=true) public Object[][] scenarios() { return
		 * super.scenarios(); }
		 */   
	     
	}      


