package support;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driver implements WebDriver {
	public static WebDriver dr;
	public static List<WebDriver> drs = new ArrayList<WebDriver>();
	String mode = null;
	
	public driver() {
		switch(globalvariable.browser)
		{
		case "chrome":
			support.Log.debug("Initializing chrome");
			WebDriverManager.chromedriver().arch64().setup();
			ChromeOptions options = new ChromeOptions();
			mode = globalvariable.mode;
			if (System.getProperty("MODE").equals("headless")) {
				mode ="headless";
			}
			if (mode.equals("headless")) {
				options.addArguments("disable-infobars","headless","disable-gpu","disable-dev-shm-usage","no-sandbox");
				support.Log.debug("Chrome will be initialized in headless mode");
			} else {
				options.addArguments("disable-infobars","disable-gpu","disable-dev-shm-usage","no-sandbox");
				support.Log.debug("Chrome will be initialized in with UI");
			}
	 		WebDriver dr = new ChromeDriver(options);
	 		dr.manage().deleteAllCookies();
	 		dr.manage().timeouts().implicitlyWait(Integer.parseInt(globalvariable.implicit_wait), TimeUnit.SECONDS);
	        driver.dr = dr;
	        drs.add(driver.dr);
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
	
	public List<WebDriver> getallDriver() {
		return drs;
	}
	
	@Override
	public void get(String args) {
		dr.get(args);
		support.Log.debug("Navigated to " + args);
	}

	@Override
	public String getCurrentUrl() {
		String url = dr.getCurrentUrl();
		return url;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
