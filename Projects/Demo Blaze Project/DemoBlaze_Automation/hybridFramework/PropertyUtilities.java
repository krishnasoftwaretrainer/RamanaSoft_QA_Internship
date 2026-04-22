package hybridFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtilities {
	Properties prop;

	public PropertyUtilities() throws IOException {

		FileInputStream fis = new FileInputStream("src/hybridFramework/config.properties");
		prop = new Properties();
		prop.load(fis);
	}

	public String getProperty(String key) {
		return prop.getProperty(key);
	}
}
