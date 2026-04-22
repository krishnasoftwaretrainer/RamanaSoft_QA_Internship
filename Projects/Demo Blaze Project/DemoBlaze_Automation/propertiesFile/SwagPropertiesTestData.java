package propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagPropertiesTestData 
{
public static void main(String[] args) throws IOException, InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	FileInputStream fis=new FileInputStream("./src/propertiesFile/SwagData.properties");
	
	Properties prop=new Properties();
	
	prop.load(fis);
		driver.get(prop.getProperty("url"));
	Thread.sleep(3000);
	WebElement username = driver.findElement(By.id(prop.getProperty("usernameLocator")));
	username.sendKeys(prop.getProperty("username"));
	
	WebElement password = driver.findElement(By.id(prop.getProperty("passwordLocator")));
	//password.sendKeys("secret_sauce");
	password.sendKeys(prop.getProperty("password"));
	
	WebElement loginButton = driver.findElement(By.id("login-button"));
	loginButton.click();
	

}
}
