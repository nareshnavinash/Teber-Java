package support;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class globalvariable {
	public static String implicit_wait;
	public static String browser;
	public static String mode;
	
	public globalvariable() {
		super();
		readPropertyFile();
	}
	
	public void readPropertyFile() {
		Properties prop = new Properties(); {
		try (InputStream input = new FileInputStream("src/test/java/testdata/master.properties")) {
	        // load a properties file
	        prop.load(input);

	        // get the property value and print it out
	        support.Log.debug("Implicit Wait is " + prop.getProperty("implicit_wait"));
	        support.Log.debug("Browser is " + prop.getProperty("browser"));
	        support.Log.debug("Run Mode is " + prop.getProperty("mode"));
	        setImplicitWait(prop.getProperty("implicit_wait"));
	        setBrowser(prop.getProperty("browser"));
	        setMode(prop.getProperty("mode"));
	    	} catch (IOException ex) {
	        ex.printStackTrace();
	    	}
		}
	}
	
	public void setImplicitWait(String args) {
		globalvariable.implicit_wait = args;
	}
	
	public String getImplicitWait() {
		return globalvariable.implicit_wait;
	}
	public void setBrowser(String args) {
		globalvariable.browser = args;
	}
	
	public String getBrowser() {
		return globalvariable.browser;
	}
	
	public void setMode(String args) {
		globalvariable.mode = args;
	}
	
	public String getMode() {
		return globalvariable.mode;
	}
	
}