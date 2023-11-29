package com.saucedemo.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.saucesemo.webpage.SauceLogin;

public class TestScript_001 {
	public static  void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		SauceLogin rv=new SauceLogin(driver);
		rv.EnterName();
		rv.EnterPwd();
		rv.ClickOnLogin();
		
		
	}

}
