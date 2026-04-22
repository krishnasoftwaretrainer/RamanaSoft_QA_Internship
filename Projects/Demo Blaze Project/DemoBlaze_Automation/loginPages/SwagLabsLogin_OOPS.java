package loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLogin_OOPS {

	WebDriver driver;
	WebElement username, password, login;

	public void SwagValidLogin() throws InterruptedException {
		// Test Case-1
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		// 1.Enter Valid Username
		username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(2000);
		// 2.Enter InValid Password
		password = driver.findElement(By.id("password"));
		// password.sendKeys("secret_sauce");
		password.sendKeys("secret_sauce");

		Thread.sleep(2000);
		// 3.Click on Login Button
		login = driver.findElement(By.id("login-button"));
		login.click();
		Thread.sleep(2000);
		System.out.println("TC-1 is executed successfully");
	}

	public void SwagInValidLogin() throws InterruptedException {
		// Test Case-2 IV-IV
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		// 1.Enter Valid Username
		username = driver.findElement(By.id("user-name"));
		username.sendKeys("sgsdsdgsd");
		Thread.sleep(2000);
		// 2.Enter InValid Password
		password = driver.findElement(By.id("password"));
		// password.sendKeys("secret_sauce");
		password.sendKeys("dgsdgsg");

		Thread.sleep(2000);
		// 3.Click on Login Button
		login = driver.findElement(By.id("login-button"));
		login.click();
		System.out.println("TC-2 is executed successfully");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		SwagLabsLogin_OOPS obj = new SwagLabsLogin_OOPS();
		obj.SwagValidLogin();
		obj.SwagInValidLogin();
	}
}
