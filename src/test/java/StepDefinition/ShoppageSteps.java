package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;
import org.testng.asserts.*;




public class ShoppageSteps {
	
	WebDriver driver;
	
	
	@Given("User is on Shop Hoempage")
	public void user_is_on_shop_hoempage() {
	    
		System.out.println("Setting up the browser property");

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\chromedriver-116\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://shop.hasbro.com/en-in");
		String currentPageUrl = driver.getCurrentUrl();
		System.out.println("User is on : "+currentPageUrl);
	}

	@When("Check Page Title is {string}")
	public void check_page_title_is(String ExpectedPageTitle)  {
	    String ActualPageTitle = driver.getTitle();
	  
	    Assert.assertEquals(ExpectedPageTitle, ActualPageTitle);
	}

	@Then("Check for the Shop Logo is present")
	public void check_for_the_shop_logo_is_present() {
	   WebElement ShopLogo = driver.findElement(By.xpath("//img[contains(@alt, 'Hasbro Shop')]"));
	   boolean ShopLogodisplayed = ShopLogo.isDisplayed();
	   System.out.println("Shop logo is displayed");
	   Assert.assertTrue(ShopLogodisplayed);
		
		
	}

}
