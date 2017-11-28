package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import helper.ConfigReader;

public class BasePage {
	
	public WebDriver driver;
	
	@BeforeTest
	public void openBrowser()
	{
		ConfigReader config = new ConfigReader();
		System.setProperty(config.ChromeKey(),config.getChromepath());
		driver = new ChromeDriver();
		driver.get(config.getApplicationUrl());
	}
	
	@AfterTest
	public void tearDown()
	{
	driver.close();
	}

}
