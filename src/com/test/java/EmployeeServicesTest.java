package com.test.java;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.java.DashboardPage;
import com.pages.java.LogInPageOR;

public class EmployeeServicesTest extends TestBase {

	public EmployeeServicesTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	LogInPageOR loginpage = new LogInPageOR();
	DashboardPage dashboardpage = new DashboardPage();
	
	
	@BeforeMethod
	public void beforeMethod() {
		Initialization();
		}
	
	@Test(priority=1)
	public void loginTestTC_LOGIN_001() throws InterruptedException, IOException {
		loginpage.logIn(prop.getProperty("username"), prop.getProperty("password"));
		
		Assert.assertEquals(dashboardpage.getTitle(),"PayWheel");
		
		}
	
	
	
	@AfterMethod
	public void afterTest() {
		driver.close();
	}
	
	
	

}
