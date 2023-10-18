package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy(id="userName")
	private WebElement UserName;
	
	@FindBy(id="password")
	private WebElement passWord;
	
	@FindBy(id="login")
	private WebElement loginButton;
	
	@FindBy(xpath="//p[@id='name']")
	private WebElement invalidLoginErrorMsg;
	
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String username) {
		UserName.sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		passWord.sendKeys(password);
		
	}
	
	public String getLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	public void navigateToLoginPage() {
		
		driver.get("https://demoqa.com/login");
	}
	
	public void clickLoginButton() throws InterruptedException {
		loginButton.click();
		Thread.sleep(3000);
		
	}
	
	public String getInvalidLoginErrorMsg() {
		return invalidLoginErrorMsg.getText();
		
	}
	
	
	
}
