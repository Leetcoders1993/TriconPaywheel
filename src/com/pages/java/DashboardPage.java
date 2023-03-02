package com.pages.java;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class DashboardPage extends TestBase{

	public DashboardPage() throws IOException {
		super();
		
		  PageFactory.initElements(driver, this);
		  
		 }
	
	 
	
		//OR
		@FindBy(xpath="//span[text()='APPLY FOR LEAVE']")
		WebElement ApplyForLeaveHyperlink;
	  
		@FindBy(xpath="FavouritesButton") 
		WebElement FaouritesBtn;
	  
		@FindBy(xpath="//div[@class='list nav-employee']") 
	  	WebElement EmployeeServicesBtn;
	
	
	//Actions
	public String getTitle() {
		
		return driver.getTitle();
		
		
	}
	
	public void clickonFavourites() {
		FaouritesBtn.click();
		
		
	}
	
	public void clickonEmployeeService() {
		EmployeeServicesBtn.click();
	}
	  
	  
	
	
}
