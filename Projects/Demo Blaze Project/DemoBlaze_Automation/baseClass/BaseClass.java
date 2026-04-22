package baseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ConfigReader;
import utilities.ScreenshotUtil;

public class BaseClass {

	public WebDriver driver;

	@BeforeMethod
	public void browserLaunch() throws IOException {
		ConfigReader config= new ConfigReader();
		config.readConfig();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(config.getApplicationURL());
	}

	@AfterMethod
	public void closeBrowser(ITestResult result) throws IOException {

		if (ITestResult.FAILURE == result.getStatus()) {
			ScreenshotUtil.captureScreenshot(driver, result.getName());
		}

		if (driver != null) {
			driver.quit();
		}
	}

}
