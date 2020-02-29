package com.app.FTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.app.Facebook.FacebookLogin;

import FHelper.FBrowserFactory;


public class VerifyFLogin {
	@Test
	public void checkLogin() {
		//this will launch the browser and hit the url
	WebDriver driver=FBrowserFactory.startBrowser("Chrome", "https://www.facebook.com/");
	//created page object using page factory
	FacebookLogin login_page = PageFactory.initElements(driver, FacebookLogin.class);
	//call the method
	login_page.login_apsite("mahadi82@gmail.com", "01918531");
	}

}


