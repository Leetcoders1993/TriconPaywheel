package com.pages.java;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.TestBase;

public class AttendancePage extends TestBase{

	public AttendancePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//OR
	@FindBy(xpath="//span[@class='main-favourites-icon-addition ng-star-inserted']")
	WebElement addFavBtn;
		  
	@FindBy(xpath="//span[text()='Send Request']") 
	WebElement SendReqBtn;
		  
	@FindBy(xpath="//div[@class='list nav-employee']") 
	WebElement EmployeeServicesBtn;
		
		
	//Actions
	public String getTitle() {
	
		return driver.getTitle();
			}
		
	

}
