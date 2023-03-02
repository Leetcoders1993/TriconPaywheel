package com.MobilePages.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.MobileTestBase;

import io.appium.java_client.AppiumBy;

public class APIDemosHomePage extends MobileTestBase{
	
	public APIDemosHomePage(){
		
	}
	//OR
	@FindBy(xpath="Preference")
	WebElement PreferenceBtn;
	
	
	
	//Actions
	public void SwitchonWifi() {
		WebElement PreferenceBtn = driver.findElement(AppiumBy.accessibilityId("Preference"));
		WebElement PreferenceDependanciesBtn = driver.findElement(AppiumBy.accessibilityId("Preference"));
		WebElement wifiCheckbox = driver.findElement(AppiumBy.id("android:id/checkbox"));
		
		
		PreferenceBtn.click();
		PreferenceDependanciesBtn.click();
		wifiCheckbox.click();
	}
	
	
	

}
