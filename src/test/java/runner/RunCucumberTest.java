package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import support.globalvariable;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty:target/pretty/pretty.txt", "html:target/html", "json:target/json-reports/Cucumber.json"}, 
		strict = true, 
		monochrome = true,
		features = "src/test/resources/",
		glue = "stepDefinitions" )
public class RunCucumberTest
{	
	@BeforeClass
	public static void setUpClass() {
		// Run once
		globalvariable g = new globalvariable();
		System.out.println("Initialized Global variable" +g);
	}
}

// mvn clean install -Dcucumber.options='--tags @scenario_002' // to run specified tags
// mvn clean install -Dcucumber.options='--tags @sanity' -DargLine="-DMODE=headless" // to run in headless mode from commandline