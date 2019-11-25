package model;
import support.Log;
import org.openqa.selenium.WebDriver;
import locator.google;

public class googlesearch {
	public static void search_for(WebDriver driver,String arg) {
		support.WaitUtilities.waitForElementVisible(driver,google.search_box);
    	google.search_box.sendKeys(arg);
    	support.WaitUtilities.waitForElementClickable(driver, google.search_button);
    	support.ScrollUtilities.scrollToAndClick(driver, google.search_button);
		Log.info("Search is completed" );
	}
	
	public static boolean after_search_displayed(WebDriver driver) {
		support.WaitUtilities.waitForElementVisible(driver, google.after_search_image);
		boolean b = google.after_search_image.isDisplayed();
		return b;
	}
}