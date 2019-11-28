package stepDefinitions;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import cucumber.api.TestStep;
import cucumber.api.Scenario;
import cucumber.api.java.AfterStep;
import io.qameta.allure.Allure;
import support.driver;

public class hooks {

	@AfterStep
	public void handlefailure(Scenario scenario){
		Allure.step(TestStep.class.getCanonicalName());
		if(scenario.isFailed()) {
			List <WebDriver> dr_list = driver.drs;
			for(int i = 0; i < dr_list.size(); i++) {
				WebDriver curr_dr = dr_list.get(i);
				if (curr_dr != null) {
					try {
			              scenario.write("Current Page URL is " + curr_dr.getCurrentUrl());
			              byte[] screenshot = ((TakesScreenshot)curr_dr).getScreenshotAs(OutputType.BYTES);
			              scenario.embed(screenshot, "image/png");
			              Allure.addAttachment("Driver "+ curr_dr, new ByteArrayInputStream(((TakesScreenshot)curr_dr).getScreenshotAs(OutputType.BYTES)));
			        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
			            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
			        }
				}
	        }	
		}
	}
}
