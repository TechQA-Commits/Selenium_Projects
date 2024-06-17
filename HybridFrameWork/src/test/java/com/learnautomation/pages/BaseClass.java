package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.learnautomation.Utility.BrowserFactory;
import com.learnautomation.Utility.ConfigDataProvider;
import com.learnautomation.Utility.ExcelDataProvider;
import com.learnautomation.Utility.Helper;

public class BaseClass {
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void SuiteSetup()
	{
		excel= new ExcelDataProvider();
		config= new ConfigDataProvider();
	}
	@Parameters("browser")
	@BeforeClass
	public void OpenApplication(String browser)
	{
		//driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getQAUrl());
		driver = BrowserFactory.startApplication(driver, browser, config.getQAUrl());
		System.out.println(driver.getTitle());
	}
	
	@AfterClass
	public void QuiteApplication()
	{
		BrowserFactory.quiteBrowser(driver);
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.CaptureScreenshot(driver);
		}

	}
	

}
