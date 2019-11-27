package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Log;

public class WaitUtilities {


	public static void waitForElementVisible(WebDriver driver, WebElement e){
		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(globalvariable.implicit_wait));
		WebElement element = wait.until(ExpectedConditions.visibilityOf(e));
		Log.debug("Element visible %s" + element);
	}
	
	public static void waitForElementClickable(WebDriver driver, WebElement e){
		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(globalvariable.implicit_wait));
		e = wait.until(ExpectedConditions.elementToBeClickable(e));
		Log.debug("Element Clickable %s" + e);
	}
	
	public static boolean waitForPageTitle(WebDriver driver, String title){
		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(globalvariable.implicit_wait));
		return wait.until(ExpectedConditions.titleContains(title));
	}
	
	public static void sleep(long length){
	    try {
	        Thread.sleep(length);
	    } catch (InterruptedException e) {
	        Log.error("Sleep Interrupted");
	        e.printStackTrace();
	    }
	}
	
	

}