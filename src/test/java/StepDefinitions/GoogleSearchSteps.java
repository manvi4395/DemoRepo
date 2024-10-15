package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	@Given("Browser is open")
	public void browser_is_open() {
		
	    System.out.println("User opens browser page");
	    System.setProperty("webdriver.chrome.driver", "C:/Users/Suvi/eclipse-workspace/CucumberJava/src/test/resources/Drivers/chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@When("User is on google search page")
	public void user_is_on_google_search_page() {
	    
		System.out.println("User is on login page");
	}

	@And("User enters the text in search box")
	public void user_enters_the_text_in_search_box() {
	   
		System.out.println("User enters text in search box");
	}

	@And("Hits enter")
	public void hits_enter() {
	    
		System.out.println("Userhits enter");
	}

	@Then("User is navigated to search resultss")
	public void user_is_navigated_to_search_resultss() {
	    
		System.out.println("User is navigated to search results");
	}


}
