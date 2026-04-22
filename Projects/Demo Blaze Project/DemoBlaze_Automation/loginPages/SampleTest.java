package loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		WebElement username1 = driver.findElement(By.id("user-name"));
		username1.sendKeys("standard_user");
		Thread.sleep(2000);
		// 2.Enter InValid Password
		WebElement password1 = driver.findElement(By.id("password"));
		//password.sendKeys("secret_sauce");
		password1.sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		// 3.Click on Login Button
		WebElement login1 = driver.findElement(By.id("login-button"));
		login1.click();

	}

}
