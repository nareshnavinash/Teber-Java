package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty:target/pretty/pretty.txt", "html:target/html", "json:target/json-reports/Cucumber.json"}, 
		strict = false, 
		monochrome = true,
		features = "src/test/resources/",
		glue = "steps" )
public class RunCucumberTest
{	
	@BeforeClass
	public static void setUpClass() {
		// Run once
	}
	
	
	
}

// mvn test -Dcucumber.options='--tags "@test"' // to run specified tags
// mvn clean install -DargLine="-DMODE=headless" // to run in headless mode from commandline