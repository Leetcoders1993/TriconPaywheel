package com.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class MobileTestBase {
	
	public AndroidDriver driver;
	public void config() throws MalformedURLException {
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("TestENv");
		options.setApp("C:\\Users\\sanjay.adaki\\eclipse-workspace\\paywheelautomation\\src\\com\\mobileresources\\ApiDemos-debug.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}

}
