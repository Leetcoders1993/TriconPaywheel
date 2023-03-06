package testInt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logInPage {
	
	
	void loginPage(){
		
		/*
		 * super(); PageFactory.initElements(driver, this);
		 */
		
	}
	
	
	
	//OR
	@FindBy(xpath="")
	WebElement u_nameIP;
	
	@FindBy(xpath="")
	WebElement u_pwd;
	
	@FindBy(xpath="")
	WebElement lgn_btn;
	
	
	//actions
	
	public void loginBtn(String u_name,String u_pwds) {
		
		u_nameIP.sendKeys(u_name);
		
		u_pwd.sendKeys(u_pwds);
		
		lgn_btn.click();
		
	
		
		
	}
	
	
	
	
	

}
