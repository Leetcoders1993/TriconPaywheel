package com.test.java;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.java.DashboardPage;
import com.pages.java.LogInPageOR;


public class LoginTest extends TestBase{
	
	LogInPageOR loginpage = new LogInPageOR();
	DashboardPage dashboardpage = new DashboardPage();
	
	public LoginTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void beforeMethod() {
		Initialization();
		}
	
	@Test(priority=1)
	public void loginTestTC_LOGIN_001() throws InterruptedException, IOException {
		loginpage.logIn(prop.getProperty("username"), prop.getProperty("password"));
		
		Assert.assertEquals(dashboardpage.getTitle(),"PayWheel");
		
		
		
		}
	
	@Test(priority=2)
	public void loginTestTC_LOGIN_002() throws InterruptedException, IOException {
		loginpage.logIn(prop.getProperty("username"), prop.getProperty("InvalidPwd"));
		
		Assert.assertEquals(loginpage.getAuthMessage(), "Provided username or password is incorrect");
		}
	
	@Test(priority=3)
	public void loginTestTC_LOGIN_003() throws InterruptedException, IOException {
		loginpage.logIn(prop.getProperty("InvalidUserName"), prop.getProperty("password"));
		
		Assert.assertEquals(loginpage.getAuthMessage(), "Provided username or password is incorrect");
		
		}
	
	@Test(priority=4)
	public void loginTestTC_LOGIN_004() throws InterruptedException, IOException {
		loginpage.logIn(prop.getProperty("InvalidUserName"), prop.getProperty("InvalidPwd"));
		Assert.assertEquals(loginpage.getAuthMessage(), "Provided username or password is incorrect");
		
		}
	
	
	@AfterMethod
	public void afterTest() {
		driver.close();
	}
	
	
	

}
