package support;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormControlUtilities {

	public static void overwriteTextField(WebDriver driver, By locator, String value){
		ScrollUtilities.scrollToElement(driver, locator);
	    WebElement field = driver.findElement(locator);
	    field.click(); //Work around for problem where clear wasn't working in iedriver
	    field.clear();
	    field.sendKeys(value);
	}
		
	public static void selectFromComboBox(WebDriver driver, By locator, String option){
		ScrollUtilities.scrollToElement(driver, locator);
	    Select fieldBox = new Select(driver.findElement(locator));
	    try {
	        fieldBox.selectByVisibleText(option);
	    } catch (NoSuchElementException e) {
	        fieldBox.selectByValue(option);
	    }        
	}

	public static void selectFromComboBox(WebDriver driver, By locator, int index){
		ScrollUtilities.scrollToElement(driver, locator);
	    Select fieldBox = new Select(driver.findElement(locator));
	    fieldBox.selectByIndex(index);       
	}
	
	public static String findSelectedRadioButton(WebDriver driver, By locator){
		ScrollUtilities.scrollToElement(driver, locator);
		List<WebElement> radioButtons = driver.findElements(locator);
	    int num = radioButtons.size();
	    String selected = "...";
	    for (int i = 0; i < num; i ++){
	        if(radioButtons.get(i).isSelected()){
	        	selected = radioButtons.get(i).getAttribute("value");
	        }
	    }
	    return selected;
	}

	public static void chooseRadioButton(WebDriver driver, By locator, String valueToSelect){
		ScrollUtilities.scrollToElement(driver, locator);
	    List<WebElement> radioButtons = driver.findElements(locator);
	    int num = radioButtons.size();
	    for (int i = 0; i < num; i ++){
		        String value = radioButtons.get(i).getAttribute("value");
		        if(value != null &&  value.equalsIgnoreCase(valueToSelect)){
		            radioButtons.get(i).click();
		        }
	    }
	}

	public static void setCheckbox(WebDriver driver, By locator,  boolean checked){
		ScrollUtilities.scrollToElement(driver, locator);
	    WebElement checkbox = driver.findElement(locator);
	    if(checkbox.isSelected() != checked){
	        checkbox.click();
	    }
	}
	
	public static void setCheckbox(WebDriver driver, WebElement checkbox, boolean checked){
		ScrollUtilities.scrollToElement(driver, checkbox);
		if(checkbox.isSelected() != checked){
	        checkbox.click();
	    }
	}

}