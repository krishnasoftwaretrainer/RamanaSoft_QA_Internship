package dataDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SwagTestData_ExcelSheets 
{

	@DataProvider(name="SwagLabs_All_TestCases")
	public Object[][] SwagTestData() throws IOException 
	{
	
	return ExcelUtilities_R.readExcelData1(
            "D:\\QT\\QT_Selenium_228,229\\ExcelFiles\\SwagLoginTestData.xlsx",
            "Sheet1"
    );
}
	
	
@Test(dataProvider = "SwagLabs_All_TestCases")
public void SwagLabsLogin(String UserName, String Password) throws InterruptedException
 //Without ReturnType and With Parameters 
{
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	 
	driver.get("https://www.saucedemo.com/");
	//Thread.sleep(2000);
	
	driver.findElement(By.id("user-name")).sendKeys(UserName);
	//Thread.sleep(2000);
	
	driver.findElement(By.id("password")).sendKeys(Password);
	//Thread.sleep(2000);
	
	driver.findElement(By.id("login-button")).click();
	//Thread.sleep(2000);
	
	driver.close();	
}


}
