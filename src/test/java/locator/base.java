package locator;

import org.openqa.selenium.WebDriver;

public abstract class base {
	public static WebDriver driver;
	public static boolean bResult;

	public  base(WebDriver driver){
		base.driver = driver;
		base.bResult = true;
	}

}