package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import locator.google;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Stepdefs {
    public static WebDriver driver;

    @Given("today is Sunday")
    public void today_is_Sunday() {
        // Write code here that turns the phrase above into concrete actions
    	driver = new support.driver().getDriver();
    	driver.get("http://www.google.com/");
 		System.out.format("Thread ID - %2d - feature file.\n", Thread.currentThread().getId());
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
    	PageFactory.initElements(driver,google.class);
    	google.search_box.sendKeys("test");
        google.search_button.click();
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals("asdf", "asdf");
        driver.quit();
        
    }
}