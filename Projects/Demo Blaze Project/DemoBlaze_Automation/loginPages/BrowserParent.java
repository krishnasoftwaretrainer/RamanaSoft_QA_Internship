package loginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserParent 
      {
	 WebDriver driver;
	
	public  void BrowserParent1(String URL) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		//driver.get("https://www.saucedemo.com/");
		//driver.close();
		//
		}
	
	public void closeBrowser()
	{		
		if(driver!=null) //Pass Fail if driver is null
		{
		driver.quit();
		}
		
		
	}
}
