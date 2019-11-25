package support;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class ScrollUtilities {

	public static void scrollDown(WebDriver driver, int pixels){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, "+pixels+")", "");
	}
	
	public static void scrollUp(WebDriver driver, int pixels){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll("+pixels+", 0)", "");
	}

	public static void scrollToAndClick(WebDriver driver, WebElement e){
		ScrollUtilities.scrollToTop(driver);
		try{
			e.click();
		}
		catch(WebDriverException wde){
			if(wde.getMessage().contains("Element is not clickable at point")){
				scrollDown(driver, 50);
				scrollToAndClick(driver, e);
			}
			else{
				Log.error(wde.getMessage());
				wde.printStackTrace();
			}
		}
		Log.debug("Scrolled to and clicked on "+ e);
	}

	public static void scrollToTop(WebDriver driver){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(document.body.scrollHeight, 0)", "");
	}
}