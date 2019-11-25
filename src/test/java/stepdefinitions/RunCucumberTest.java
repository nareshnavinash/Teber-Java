package stepdefinitions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

// import io.qameta.allure.Allure;
import support.globalvariable;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty:target/pretty/pretty.txt", "html:target/html", "json:target/json-reports/Cucumber.json"}, 
		strict = false, 
		monochrome = true,
		features = "src/test/resources/")
public class RunCucumberTest
{
	
	@BeforeClass
	public static void setUpClass() {
		globalvariable g = new globalvariable();
		String i = g.getImplicitWait();
		String b = g.getBrowser();
		support.Log.debug("Browser is " + b);
		support.Log.debug("Implicit Wait is " + i);
	}
	
	
	@AfterClass
    public static void embedScreenshot() {
		 // Allure.addAttachment("Some Screenshot", imageAsByteArrayIS);
		 // Allure.addAttachment(nameTest, new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
//		if(scenario.isFailed()) {
//            try {
//                scenario.write("Current Page URL is " + driver.getCurrentUrl());
////            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
//                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//                scenario.embed(screenshot, "image/png");
//            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
//                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
//            }
//
//        }
//        driver.quit();
    }
}

// mvn test -Dcucumber.options='--tags "@test"'
// mvn install "-Dmyproperty=my property from command line"