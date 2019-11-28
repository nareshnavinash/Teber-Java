package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import locator.google;

import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class googlesteps {
    public static WebDriver driver;
    
    @Before("@TC_Google_Search")
    public void beforeScenario() {
    	driver = new support.driver().getDriver();
    }

    @After("@TC_Google_Search")
    public void afterScenario() {
    	driver.quit();
    }
    
    @BeforeStep
    public void doSomethingBeforeStep(){
    	// Add if needed
    }
    
    @AfterStep
    public void doSomethingAfterStep(){
    	// Add if needed
    }

    @Given("I navigate to google search page")
    public void i_navigate_to_google_search_page() {
    	driver.get(hooks.data.getProperty("googleurl"));
 		System.out.format("Thread ID - %2d - feature file.\n", Thread.currentThread().getId());
    }

    @When("I type the term in google search bar and click on serach results")
    public void i_type_the_term_in_google_search_bar_and_click_on_serach_results() {
    	PageFactory.initElements(driver,google.class);
    	pages.googlesearch.search_for(driver, hooks.data.getProperty("single_search"));
    }
    
    @When("I type the {string} in google search bar and click on serach results")
    public void i_type_the_in_google_search_bar_and_click_on_serach_results(String string) {
    	PageFactory.initElements(driver,google.class);
    	pages.googlesearch.search_for(driver, string);
    }

    @Then("I should get the results page")
    public void i_should_get_the_results_page() {
    	assertEquals(pages.googlesearch.after_search_displayed(driver), true);
    }
}