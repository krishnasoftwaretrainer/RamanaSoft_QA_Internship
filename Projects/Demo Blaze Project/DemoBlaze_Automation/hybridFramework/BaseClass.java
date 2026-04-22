package hybridFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class BaseClass {

	public WebDriver driver;  //Global Object
	public PropertyUtilities prop;

	@BeforeMethod
	public void setup() throws IOException {
		prop = new PropertyUtilities();
		driver = new EdgeDriver();
		//driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(prop.getProperty("baseUrl"));
	}

	@AfterMethod
	public void tearDown() 
	{
		if (driver != null) {
		driver.quit();
	}
	}
}
