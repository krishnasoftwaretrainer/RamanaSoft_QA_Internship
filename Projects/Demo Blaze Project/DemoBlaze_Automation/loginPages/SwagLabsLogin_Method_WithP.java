package loginPages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class SwagLabsLogin_Method_WithP extends BrowserParent
{

	int i=1; //
		
	public  SwagLabsLogin_Method_WithP(String susername, String spassword) throws InterruptedException {
		// Test Case-1
		//driver.get("https://www.saucedemo.com/");
		//super("https://www.saucedemo.com/");
		BrowserParent1("https://www.saucedemo.com/");
		// 1.Enter Valid Username
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys(susername);
		Thread.sleep(2000);
		// 2.Enter InValid Password
		WebElement password = driver.findElement(By.id("password"));
		// password.sendKeys("secret_sauce");
		password.sendKeys(spassword);

		Thread.sleep(2000);
		// 3.Click on Login Button
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		Thread.sleep(2000);
		//Print like TC-1 is executed successfully, TC-2 is executed successfully, TC-3 is executed successfully, TC-4 is executed successfully, TC-5 is executed successfully, TC-6 is executed successfully, TC-7 is executed successfully
			System.out.println("TC-"+i+" is executed successfully");
			i++;  //2	
		
		Thread.sleep(2000);
		//driver.close();
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		SwagLabsLogin_Method_WithP obj = new SwagLabsLogin_Method_WithP("standard_user","secret_sauce");
		obj.closeBrowser();
		obj = new SwagLabsLogin_Method_WithP("standard_user","fghfjhjh");
		obj.closeBrowser();
		obj = new SwagLabsLogin_Method_WithP("standard_user"," ");
		obj.closeBrowser();
		obj = new SwagLabsLogin_Method_WithP("locked_out_user","secret_sauce");
		obj.closeBrowser();
	
	} }
