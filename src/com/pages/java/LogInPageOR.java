package com.pages.java;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LogInPageOR extends TestBase {

	public LogInPageOR() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		  
	}
	
	 //OR
	  @FindBy(xpath="//input[@placeholder='Your username or email address']")
	  WebElement userName;
	  
	  @FindBy(xpath="//input[@placeholder='Your password']") WebElement Password;
	  
	  @FindBy(xpath="//button[text()='Sign In']") 
	  WebElement Login_btn;
	  
	  	

	//Actions
		
		public void logIn(String u_name,String pwd) {
			WebElement userName_ = driver.findElement(By.xpath("//input[@placeholder='Your username or email address']"));
			WebElement Password_ = driver.findElement(By.xpath("//input[@placeholder='Your password']"));
			WebElement logInBtn = driver.findElement(By.xpath("//button[text()='Sign In']"));
			userName_.sendKeys(u_name);
			Password_.sendKeys(pwd);
			logInBtn.click();
		}
		
		public String loginPageTitle() {
			return driver.getTitle();
			
		}
		
		public String getAuthMessage() {
			return driver.findElement(By.
					xpath("//div[text()='Provided username or password is incorrect']")).
					getText();
		}
		
		 
		
}
