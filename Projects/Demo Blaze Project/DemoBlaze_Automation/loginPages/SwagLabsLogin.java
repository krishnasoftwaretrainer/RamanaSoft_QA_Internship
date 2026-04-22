package loginPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabsLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		//Test Case-1
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		// 1.Enter Valid Username
		WebElement username =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
		username.sendKeys("standard_user");
		Thread.sleep(2000);
		// 2.Enter InValid Password
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		password.sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		// 3.Click on Login Button
		WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
		login.click();
		Thread.sleep(2000);
		System.out.println("TC-1 is executed successfully"); 
		// driver.close();
		// Thread.sleep(2000);
		 
		//Test Case-2 IV-IV
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.saucedemo.com/");
		
		// 1.Enter Valid Username
		WebElement username1 = driver1.findElement(By.id("user-name"));
		username1.sendKeys("sgsdsdgsd");
		Thread.sleep(2000);
		// 2.Enter InValid Password
		WebElement password1 = driver1.findElement(By.id("password"));
		//password.sendKeys("secret_sauce");
		password1.sendKeys("dgsdgsg");
		
		Thread.sleep(2000);
		// 3.Click on Login Button
		WebElement login1 = driver1.findElement(By.id("login-button"));
		login1.click();
		System.out.println("TC-2 is executed successfully");
		
		/*
		//WebElement ErrorMesg=driver.findElement(By.xpath("//h3[text()=\"Epic sadface: Username and password do not match any user in this service\"]"));
		//Absolute Xpath
		//WebElement ErrorMesg=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3"));
		//System.out.println("Error Message: "+ErrorMesg.getText());
		
		if (ErrorMesg.isDisplayed())
		{
			System.out.println("Login is Failed, Please Check the Username and Password");
			System.out.println("Entered UserName: "+username.getAttribute("value"));
			System.out.println("Entered Password: "+password.getAttribute("value"));
		}
		else
		{
			System.out.println("Login is Successful");
		} */
	}

}
