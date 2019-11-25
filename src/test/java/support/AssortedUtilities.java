package support;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import support.Log;

public class AssortedUtilities {

	public static String generateUniqueText(){
	    Date date = new Date();
	
	    SimpleDateFormat UNIQUE_DATE_TIME_STRING_FORMAT = new SimpleDateFormat(
	            "yyyyMMddHHmmSS");
	    String dateTimeString = UNIQUE_DATE_TIME_STRING_FORMAT.format(date);
	
	    return dateTimeString;
	}

	public static void dragAndDropElement(WebDriver driver, By locator, int xOffset, int yOffset){
	    WebElement slider = driver.findElement(locator);
	    Actions move = new Actions(driver);
	    Action action = (Action) move.dragAndDropBy(slider, xOffset, yOffset).build();
	    action.perform();
	}

	public static void captureScreenshot(WebDriver driver, String fileName){
	    try{
	        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Log.trace("Screenshot Taken");
	        FileUtils.copyFile(screenshot, new File(fileName));
	        Log.trace("Screenshot Saved");
	    }
	    catch(Exception e){
	        Log.error("Failure to take/save screenshot" + e);
	    }
	}

	public static boolean elementPresent(WebDriver driver, By locator){
		try{
			driver.findElement(locator);
			return true;
		}
		catch(NoSuchElementException e){
			return false;
		}
	}
}