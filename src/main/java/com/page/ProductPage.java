package com.page;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.base.BaseClass;

public class ProductPage extends BaseClass{

	@FindBy(name="add-to-cart-sauce-labs-backpack")
	WebElement backcart;
	@FindBy(xpath="//*[@id=\"item_4_img_link\"]/img")
	WebElement logo;
	
	public ProductPage menue() {
		
	driver.findElement(By.id("react-burger-menu-btn")).click();
	return  new ProductPage();
	}
	public void backpack() {
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	
	
		
	}
	public  void backppackicture() {
	
		 logo=driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img"));
		if(logo.isDisplayed());
		System.out.println("image is there");
		//Get the text
		
	
		
			
		
		
		
	}


	}
	

