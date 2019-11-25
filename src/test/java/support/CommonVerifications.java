package support;

import java.util.ArrayList;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

public class CommonVerifications {


    public static void checkEqualsStrings(String[] actual, String[] expected) {
        for (int i = 0; i < actual.length; i++) {
        	Log.debug("Actual: " + actual[i] + " Expected: " + expected[i]);
            assertEquals(actual[i], expected[i], "Incorrect string " + i + " - Actual: " +
            											 actual[i] + " Expected: " + expected[i]);
        }
    }
    
    public static void checkEqualsStrings(ArrayList<String> actual, ArrayList<String> expected){
    	for (int i = 0; i < actual.size(); i++) {
        	Log.debug("Actual: " + actual.get(i) + " Expected: " + expected.get(i));
            assertEquals(actual.get(i), expected.get(i), "Incorrect string " + i + " - Actual: "
					 											+ actual.get(i) + " Expected: " 
					 											+ expected.get(i));
        }
    }

}