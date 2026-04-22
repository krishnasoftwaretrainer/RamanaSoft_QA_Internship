package dataDrivenFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import test.ExcelUtilities1;

public class SwagTestData_ExcelExcepted_Assert {

	@DataProvider(name = "loginData")
    public Object[][] loginData() throws Exception {
        return ExcelUtilities1.readExcelData(
                "D:\\QT\\QT_Selenium_228,229\\ExcelFiles\\SwagTestDataAssert.xlsx",
                "Sheet1"
        );
    }
	
	@Test(dataProvider = "loginData")
    public void loginTest(String username, String password,String expected)
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
       
        SoftAssert softAssert = new SoftAssert();
        
        if(expected.equalsIgnoreCase("homepage")) 
		{
		String actuvalURL = driver.getCurrentUrl();
        softAssert.assertEquals(actuvalURL, "https://www.saucedemo.com/inventory.html","URL is not matching");
		}
        
        else if(expected.equalsIgnoreCase("error"))
        {
        String actualError = driver.findElement(By.xpath("//h3[@data-test=\"error\"]")).getText();
		softAssert.assertTrue(actualError.contains("Epic sadface:"),"Error message is not Displayed");
        }
        
        softAssert.assertAll();
		driver.close();
	       
        
        
	}

}
