package support;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driver implements WebDriver {
	public static WebDriver dr;
	public static List<WebDriver> drs = new ArrayList<WebDriver>();
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
