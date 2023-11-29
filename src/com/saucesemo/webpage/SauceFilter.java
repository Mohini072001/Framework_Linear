package com.saucesemo.webpage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SauceFilter {
	WebDriver driver;
    public SauceFilter(WebDriver d) {
 	   driver=d;
 	   PageFactory.initElements(driver, this);
 	   }
    @FindBy(xpath = ".//select[@class='product_sort_container']")
    WebElement filter;
    @FindBy(xpath = ".//div[@class='inventory_item_price']")
    List<WebElement> price;
    public void filtterOption()
    {
    	Select s= new Select(filter);
    	s.selectByValue("lohi");
    }
    public void printPrice()
    {
    	for(int i=0;i<price.size();i++)
		{
		System.out.println("total no of price------"+price.get(i).getText());
	}
		driver.close();
}
	
    }
	
	


