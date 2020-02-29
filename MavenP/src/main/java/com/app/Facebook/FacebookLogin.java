package com.app.Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLogin {
	WebDriver driver;
	public FacebookLogin(WebDriver Fdriver)
	{
		this.driver=Fdriver;
	
	}
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")
	WebElement Forgot_password;
	
	@FindBy(xpath="//*[@id=\"loginbutton\"]")
	WebElement Log_In;
   public void login_apsite(String uid, String Pass)
   {
	   username.sendKeys(uid);
	   password.sendKeys(Pass);
	   Log_In.click();
   }
	   
   }

