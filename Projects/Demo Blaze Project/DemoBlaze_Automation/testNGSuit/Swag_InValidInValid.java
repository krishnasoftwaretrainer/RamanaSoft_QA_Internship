package testNGSuit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Swag_InValidInValid {

	WebDriver driver;
	@BeforeMethod
	public void BrowserSetup()
	{
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1000, 1000));
		driver.get("https://www.saucedemo.com/");
		
	}
	@Test(priority = 0)
	public void Swag_InValidInValidLogin()
	{
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("invalid");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this serv";
		String actualErrorMessage = errorMessage.getText();
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expectedErrorMessage, actualErrorMessage,"Error message does not match the expected message."); //Pass Fail
		softAssert.assertAll();
		
		
	}
	@AfterMethod
	public void BrowserTearDown()
	{
		driver.quit();
	}

}
