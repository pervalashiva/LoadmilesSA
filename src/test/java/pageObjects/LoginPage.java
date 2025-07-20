package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	@FindBy(id = "uername']")
	WebElement userName;
	
	@FindBy(id = "password")
	WebElement  password;
	
	public void userName()
	{
		userName.click();
	}
	public void pwd(String passwrd)
	{
		password.sendKeys(passwrd);
	}	
	
	
}

