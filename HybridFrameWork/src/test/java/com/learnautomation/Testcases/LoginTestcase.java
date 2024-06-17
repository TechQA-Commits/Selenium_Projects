package com.learnautomation.Testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.Utility.ExcelDataProvider;
import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;

public class LoginTestcase extends BaseClass
{

	@Test
	public void LoginAction()
	{
		ExcelDataProvider excel = new ExcelDataProvider();
		
				//Navigate to Login page
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		LoginPage Login_Page = PageFactory.initElements(driver, LoginPage.class);
		Login_Page.LoginMethod(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

	}

}
