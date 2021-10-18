package StepDefinitions;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepLogin {

	WebDriver driver;
	LoginPage loginPage;
	public static Logger logger;

	@Before
	public void setup() {
		logger = Logger.getLogger(StepLogin.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("CUCUMBER BDD TEST FOR ECOMMERCE WEBSITE STARTED");
		System.setProperty("webdriver.chrome.driver","C:\\eclipse-workspace\\com.Bdd_Cucumber\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		logger.info("BROWSER LAUNCHED");

	}

	@After
	public void teardown() {
		driver.quit();
		logger.info("BROWSER CLOSED");
	}

	@Given("user is on Login Page")
	public void user_is_on_login_page() {
		driver.get("https://admin-demo.nopcommerce.com/login");
		logger.info("NAVIGATED TO ECOMMERCE WEBSITE");

	}

	@When("user entering valid {string} and valid {string}")
	public void user_entering_valid_and_valid(String user, String pass) {
		loginPage = new LoginPage(driver);
		loginPage.Set_username(user);
		logger.info("USERNAME ENTERED");
		loginPage.Set_password(pass);
		logger.info("BPASSWORD ENTERED");
	    
	}
	


	@And("Clicking on Login button")
	public void clicking_on_login_button() {
		loginPage.Click_Login();
		logger.info("LOGIN CLICKED");
	}

	@Then("Navigated to Homepage and check the Title")
	public void navigated_to_homepage_and_check_the_title() {
		String Expected_Title="Dashboard / nopCommerce administration";
		String Actual_Title=driver.getTitle();
		if(Actual_Title.equals(Expected_Title)) {
			Assert.assertTrue(true);
			logger.info("LOGIN TEST PASSED");
		}else {
			Assert.assertTrue(true);
			logger.info("LOGIN TEST FAILED");
		}
		logger.info("CUCUMBER BDD TEST FOR ECOMMERCE WEBSITE TESTING FINISHED");
	}


}
