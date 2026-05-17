package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class saucedemo {

	WebDriver driver =null;
	@Before//we can also add tag like @Before("@smoke") or also with order like (value="@smoke", order=1)
	public void browesersetup()
	{
		System.setProperty("webdriver.gecko.driver", "src/test/resources/Drivers/geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		System.out.println("before one is checking");
	}
	
	@After
	public void driverclose()
	{
		driver.close();
		System.out.println("driver close after test");
		
	}
	
	@Given("user open the webpage")
	public void user_open_the_webpage() {
		System.out.println("browser is open");
	}

	@And("user in on logign page")
	public void user_in_on_logign_page() {

	}

	@When("selects the enters the {word} and {word}") 
	//Here {word} is used so that {word} matches text that doesn't have spaces or quotes and it checks the "When selects the enters the <username> and <password>"
	public void selects_the_enters_the_username_and_password(String username, String password) 
	//string username and string password is used so that can be used in sendkeys and can be multiple
	{
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("user is on login")
	public void user_is_on_login() {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("user is navigated to the test page")
	public void user_is_navigated_to_the_test_page() throws InterruptedException {
		Thread.sleep(5000);
	}	
	

}
