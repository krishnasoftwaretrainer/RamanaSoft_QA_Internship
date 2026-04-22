package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class Swag_Locters_Methods_BY  
	{
	 WebDriver driver;

	public Swag_Locters_Methods_BY(WebDriver driver) 
		{
			this.driver = driver;
		}
		
	By userName = By.id("user-name");
	By password = By.id("password");
	By loginButton = By.id("login-button");
	
	public void SwagLogin(String user, String pass) 
	{
		//driver.findElement(By.id("user-name")).sendKeys(user);
		
		driver.findElement(userName).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}
	
	
	/*
	public void enterUserName() 
	{
		driver.findElement(userName).sendKeys("standard_user");
	}
	
	public void enterPassword() 
	{
		driver.findElement(password).sendKeys("secret_sauce");
	}
	
	public void clickLoginButton() 
	{
		driver.findElement(loginButton).click();
	} */
	
	

}
