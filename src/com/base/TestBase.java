package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static  WebDriver driver;
	public static Properties prop;

	public TestBase() throws IOException {
		
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\sanjay.adaki\\eclipse-workspace\\paywheelautomation\\src\\com\\config\\config.properties");
		prop.load(ip);
		
	}
	
	@SuppressWarnings("deprecation")
	public static void Initialization() {
		String browserName = prop.get("browser").toString();
		if(browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		driver.get(prop.getProperty("url").toString());
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(prop.get("PAGE_LOAD_TIMEOUT").toString())
		,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.get("IMPLICIT_WAIT").toString())
		, TimeUnit.SECONDS);
		
		
		
	}

}
