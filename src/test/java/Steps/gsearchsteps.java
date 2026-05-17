package Steps;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class gsearchsteps {

	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Browser is open");
		System.setProperty("webdriver.gecko.driver", "src/test/resources/Drivers/geckodriver.exe");
		
		driver =new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
	System.out.println("User is on google search page");
	Thread.sleep(3000);
	driver.get("https://www.google.com");
	
	
	
	
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("User enters a text in search box");
		WebElement searchbox= driver.findElement(By.xpath("//textarea[@name='q']"));
		searchbox.click();
		searchbox.sendKeys("somethingsomething");
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Hits Enter");
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ENTER).build().perform();
	}

	@Then("user is navigated to seacrh results")
	public void user_is_navigated_to_seacrh_results() {
	System.out.println("navigated to search results");
	}


}
