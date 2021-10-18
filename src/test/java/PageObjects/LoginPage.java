package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver,this);


	}
	
	@FindBy(xpath = "//input[@name='Email']")
	WebElement txt_username;
	
	@FindBy(xpath = "//input[@name='Password']")
	WebElement txt_password;
	
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	WebElement but_Login;
	
	
	
	public void Set_username(String user) {
		txt_username.clear();
		txt_username.sendKeys(user);
		
	}

	
	public void Set_password(String pass) {
		txt_password.clear();
		txt_password.sendKeys(pass);
		
	}
	public void Click_Login() {
		but_Login.click();
		
		
	}

}
