package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class BFGhomepages {
	
	WebDriver driver=null;	
	
	
	@Given("user is on PC Hommepage")
	public void user_is_on_pc_hommepage() {
		System.setProperty("webdriver.gecko.driver", "src/test/resources/Drivers/geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("https://hgworld.in/");
			}

	@When("user clicks the mac button")
	public void user_clicks_the_mac_button() throws InterruptedException {
		Thread.sleep(3000);
		WebElement gc=driver.findElement(By.xpath("//span[contains(text(), 'PlayStation')]"));
	    		gc.click();
	}

	@Then("Mac homepage will open")
	public void mac_homepage_will_open() {
		    // Verification: Check the URL or Title
		    String currentUrl = driver.getCurrentUrl();
		    System.out.println("Current URL is: " + currentUrl);
		    
		    // Always close the browser at the end of the test!
		    driver.quit();
	    
	}
}
