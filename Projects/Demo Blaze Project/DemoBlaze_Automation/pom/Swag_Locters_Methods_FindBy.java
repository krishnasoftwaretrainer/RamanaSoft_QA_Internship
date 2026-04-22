package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swag_Locters_Methods_FindBy {
	WebDriver driver;

	public Swag_Locters_Methods_FindBy(WebDriver driver) {

	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	// Locators

	@FindBy(id = "user-name")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login-button")
	WebElement loginButton;

	@FindBy(xpath = "//h3[@data-test='error']")
	WebElement errorMsg;

	// Method

	public void login(String user, String pass) {
		//WebElement username1=driver.findElement(By.id("user-name"));
		//username1.sendKeys(user);
		
		username.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
	}
	
	public boolean isErrorDisplayed() {

		return errorMsg.isDisplayed();
	}

}
