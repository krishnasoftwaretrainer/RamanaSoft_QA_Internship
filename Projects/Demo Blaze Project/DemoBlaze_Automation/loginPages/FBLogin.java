
package loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import workingWithBrowsers.Browsers_Inheritence;

public class FBLogin extends Browsers_Inheritence
{
	/*
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/"); 
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Krishna@gmail.com"); 
		Thread.sleep(2000); 
		driver.findElement(By.name("pass")).sendKeys("123345"); 
		Thread.sleep(2000);
		//driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
		//org.openqa.selenium.InvalidSelectorException: Compound class names not permitted
		Thread.sleep(2000); 
		driver.findElement(By.tagName("button")).click();
		
		//https://www.saucedemo.com/
	}
	*/
	
     
	public void LoginToFB()
	{
		driver.findElement(By.id("email")).sendKeys("Krishna@gmail.com");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		FBLogin fb=new FBLogin();
		//fb.OpenChromeBrowser("https://www.facebook.com/");
		fb.OpenEdgeBrowser("https://www.facebook.com/");
		fb.LoginToFB();
		
		
		
	}



}
