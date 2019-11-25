package support;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driver {
	public static WebDriver dr;
	globalvariable g = new globalvariable();
	String implicit_wait = g.getImplicitWait();
	String browser = g.getBrowser();
	
	public driver() {
		switch(browser)
		{
		case "chrome":
			support.Log.debug("Initializing chrome");
			WebDriverManager.chromedriver().arch64().setup();
	 		WebDriver dr = new ChromeDriver();
	 		dr.manage().deleteAllCookies();
//	        dr.manage().window().maximize();
	 		dr.manage().timeouts().implicitlyWait(Integer.parseInt(implicit_wait), TimeUnit.SECONDS);
	        driver.dr = dr;
	        support.Log.debug("Chrome Initialized");
			break;
			
		case "firefox":
			// to be added
			break;
		}
		
	}
	
	public WebDriver getDriver() {
		return dr;
	}
	
	public void get(String args) {
		dr.get(args);
		support.Log.debug("Navigated to %s" + args);
	}
	
}
