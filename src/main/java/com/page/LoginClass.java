package com.page;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.base.BaseClass;

public class LoginClass extends BaseClass  {
	
	@FindBy(id="user-name")
	WebElement UserName;
	@FindBy(id="password")
	WebElement password;
	
	public LoginClass(){
		PageFactory.initElements(driver, this);

		
	} 
	public LoginClass signUp(String uName, String pass) {
		UserName.sendKeys(uName);
		password.sendKeys(pass);
		driver.findElement(By.id("login-button")).click();
		return  new LoginClass();
	}
	public String verifyTitle() {
		String myTitle= driver.getTitle();
		//String expectedTitle=("Swag Labs");
		//System.out.println("title cheeeking");
		//Assert.assertEquals(myTitle, expectedTitle);
		//System.out.println("title test pass or fail");
		return myTitle;
	}
	public LoginClass userName() {
		
		List<WebElement> accettedUsername= driver.findElements(By.xpath("//*[@id=\"login_credentials\"]"));	
		for(WebElement e: accettedUsername){
            System.out.println("The different accepted user names"+e.getText());

		}
		
	
		return new LoginClass();
		
		
	}
	
		
	
	}		
	
	
	

	
	


