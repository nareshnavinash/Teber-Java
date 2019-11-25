package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class google extends base{
	
	public google(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(how=How.NAME, using="q")
	public static WebElement search_box;
	
	
	@FindBy(how=How.NAME, using="btnK")
	public static WebElement search_button;
	
	@FindBy(how=How.CSS, using="div.logo img[alt*='Google']")
	public static WebElement after_search_image;
	



}