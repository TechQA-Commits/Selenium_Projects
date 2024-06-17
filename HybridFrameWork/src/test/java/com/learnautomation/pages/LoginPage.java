package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	public void LoginPageelements(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(name= "email") WebElement username;
	@FindBy(name= "password") WebElement password;
	@FindBy(xpath= "//*[@id=\"form\"]/div/div/div[1]/div/form/button") WebElement LoginButton;
	
	public void LoginMethod(String uname, String pword)
	{
		try 
		{
		Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
			
		}
		username.sendKeys(uname);
		password.sendKeys(pword);
		LoginButton.click();
	}
	
}
