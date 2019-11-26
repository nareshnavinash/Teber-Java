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

// mvn test -Dcucumber.options='--tags "@test"'
// mvn install "-Dmyproperty=my property from command line"