package com.mobiletests.com;

import java.net.MalformedURLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.MobilePages.java.APIDemosHomePage;
import com.base.MobileTestBase;
import io.appium.java_client.AppiumBy;
import org.testng.asserts.SoftAssert;

public class LogInMobileTest extends MobileTestBase {

	APIDemosHomePage homepage = new APIDemosHomePage();

	@BeforeMethod
	public void setup() throws MalformedURLException {
		config();
	}

	
	@Test 
	public void BatteryChargeTest() throws MalformedURLException {
	  
		Assert.assertEquals(driver.getBatteryInfo().getLevel(),1.0);
		}
	 

	@Test
	public void SystemTime() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		dtf.format(now);  
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(driver.getDeviceTime().toString(), dtf.format(now));
		
	}

	
	@Test 
	public void SwitchOnWifi() throws MalformedURLException {
	
	  //homepage.SwitchonWifi();
	  driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	  driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).
	  click(); driver.findElement(AppiumBy.id("android:id/checkbox")).click();
	  
	  }
	 

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
