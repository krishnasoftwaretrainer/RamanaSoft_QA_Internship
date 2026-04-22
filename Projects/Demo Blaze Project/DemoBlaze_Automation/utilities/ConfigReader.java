package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	Properties prop;

	public void readConfig() throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/config.properties");

		prop = new Properties();
		prop.load(fis);
	}

	public String getApplicationURL() {
		return prop.getProperty("url");
	}

}
