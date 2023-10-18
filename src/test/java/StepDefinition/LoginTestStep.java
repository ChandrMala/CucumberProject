package StepDefinition;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginTestStep {
	
	private WebDriver driver;
	LoginPage loginpage;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\chromedriver-116\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		loginpage = new LoginPage(driver);
	}

	@Given("User is on login page")
	public void User_is_on_login_page() {

		loginpage.navigateToLoginPage();
	}

	@Then("Validate the page title of the loginpage is {string}")
	public void validate_title_of_the_login_page(String expectedtitle) {
		
		String loginPageTitle = loginpage.getLoginPageTitle();
		Assert.assertEquals(expectedtitle, loginPageTitle);
		
	}

	@When("User enters {string} in UserName field")
	public void user_enters_in_UserName_field(String username) {
		loginpage.enterUserName(username);
		
	}

	@When("User enters {string} in Password field")
	public void user_enters_in_Password_field(String password) {
		loginpage.enterPassword(password);
		
		
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		loginpage.clickLoginButton();
		
	}

	@Then("Validate {string} is displayed")
	public void validate_errormsg_is_displayed(String expected_message) {
			String actualErrormsg = loginpage.getInvalidLoginErrorMsg();
			Assert.assertEquals(expected_message, actualErrormsg);

	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
	
	
	

}
