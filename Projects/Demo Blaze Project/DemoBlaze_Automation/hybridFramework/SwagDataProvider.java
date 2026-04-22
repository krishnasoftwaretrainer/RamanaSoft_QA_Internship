package hybridFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SwagDataProvider extends BaseClass 
{
	@DataProvider(name = "SwagLabs_All_TestCases")
	public Object[][] SwagTestData() throws IOException {
		return ExcelUtilities.readExcelData("src/hybridFramework/SwagLoginTestData.xlsx",
				"SwagTestData");

	}

	@Test(dataProvider = "SwagLabs_All_TestCases")
	public void SwagLabsLogin(String UserName, String Password) throws InterruptedException {

		driver.findElement(By.id(prop.getProperty("username_id"))).sendKeys(UserName);

		driver.findElement(By.id(prop.getProperty("password_id"))).sendKeys(Password);

		driver.findElement(By.id(prop.getProperty("loginBtn_id"))).click();

		Thread.sleep(2000);
	}

}
