package stepDefinitions;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.AfterStep;
import cucumber.api.java.BeforeStep;
import io.qameta.allure.Allure;
import support.driver;

public class hooks {
	public static Properties data;

	@AfterStep
	public void handlefailure(Scenario scenario){
		Allure.step(scenario.getLines().get(0).toString());
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
	
	@BeforeStep
	public void intializeTestData(Scenario scenario) {
		String s = scenario.getId();
		String[] arrOfStr = s.split("/", 20);
		String filename = arrOfStr[arrOfStr.length - 1];
		String [] finalarrayStr = filename.split(":", 2);
		String featureFileName = finalarrayStr[0].substring(0, finalarrayStr[0].length() - 8);
		data = new Properties(); {
			try (InputStream input = new FileInputStream("src/test/java/testdata/"+featureFileName+".properties")) {
		        // load a properties file
		        data.load(input);
		    	} catch (IOException ex) {
		        ex.printStackTrace();
		    	}
			}
	}
}
