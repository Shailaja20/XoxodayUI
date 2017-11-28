package helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	Properties pro;

	public ConfigReader() {
		try {
			File src = new File("./Configuration/XoxodayUI.property");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is = " + " " + e.getMessage());
		}
	}
	
	public String getChromepath()
	{
		return pro.getProperty("ChromeDriverpath");
	}
	
	public String ChromeKey()
	{
		return pro.getProperty("ChromeKey");
	}
	
	public String getApplicationUrl()
	{
		return pro.getProperty("ApplicationUrl");
	}
}
