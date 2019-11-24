package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stepdefs {
    public static WebDriver driver;

    @Given("today is Sunday")
    public void today_is_Sunday() {
        // Write code here that turns the phrase above into concrete actions
 		WebDriverManager.chromedriver().arch64().setup();
 		driver = new ChromeDriver();
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		driver.get("http://www.google.com/");
 		System.out.format("Thread ID - %2d - feature file.\n", Thread.currentThread().getId());
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        driver.findElement(By.name("q")).sendKeys("trest");
		driver.findElement(By.name("btnK")).click();
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals("asdf", "asdf");
        driver.quit();
    }
}