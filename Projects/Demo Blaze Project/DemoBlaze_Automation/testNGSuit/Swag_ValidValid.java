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

public class Swag_ValidValid {

	WebDriver driver;
	@BeforeMethod
	public void BrowserSetup()
	{
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1000, 1000));
		driver.get("https://www.saucedemo.com/");
		
	}
	@Test(priority = 0)
	public void Swag_ValidValidLogin()
	{
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		String expectedURL = "https://www.saucedemo.com/inventory.html";
		String actualURL = driver.getCurrentUrl();
		//Hard Assert
		//Assert.assertEquals(actualURL, expectedURL); //Pass Fail
		//Soft Assert
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualURL, expectedURL,"TestCase is Fail for Valid Test Data"); //Pass Fail
		
		System.out.println("Test Case is Excuted"); //Print 
		softAssert.assertAll(); //Report
		
		
	}
	@AfterMethod
	public void BrowserTearDown()
	{
		driver.quit();
	}

}
