package com.saucesemo.webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceLogin {
	private WebElement Unname;
	private WebElement PWD;
	private WebElement Login;
	public SauceLogin(WebDriver driver)
	{
		Unname=driver.findElement(By.id("user-name"));
		PWD=driver.findElement(By.id("password"));
		Login=driver.findElement(By.id("login-button"));
	}
	public void EnterName()
	{
		Unname.sendKeys("standard_user");
	}
	public void EnterPwd() {
		PWD.sendKeys("secret_sauce");
	}
	public void ClickOnLogin() {
		Login.click();
	}

}
