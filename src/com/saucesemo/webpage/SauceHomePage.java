package com.saucesemo.webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceHomePage 
 {
       WebDriver driver;
       public SauceHomePage(WebDriver d) {
    	   driver=d;
    	   PageFactory.initElements(driver, this);
    	   }
       @FindBy(id="add-to-cart-sauce-labs-backpack")
       WebElement addpro;
       @FindBy(className ="shopping_cart_link")
       WebElement icon;
       @FindBy(xpath = ".//div[@class='cart_item_label']")
       WebElement checkproduct;
       
       public void addProduct()
       {
    	   addpro.click();
       }
       public void clickOnIcon()
       {
    	   icon.click();
       }
       public void checkProductAdd()
       {
    	   boolean tgt = checkproduct.isDisplayed();
    	   if(tgt)
   		{
   			System.out.println("product added");
   		}
   		else
   		{
   			System.out.println("product not added");
   		}
   		driver.close();
       }
}
