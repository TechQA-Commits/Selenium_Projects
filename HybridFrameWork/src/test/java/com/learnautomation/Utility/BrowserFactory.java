package com.learnautomation.Utility;


import java.time.Duration;

//import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver, String browserName, String appUrl)
	{
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\prath\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.IE.driver", "C:\\Users\\prath\\Downloads\\IEDriverServer_x64_4.14.0\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		else
		{
			System.out.println("We do not support this browser");
		}
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		return driver;
	}
	
	 	public static void quiteBrowser(WebDriver driver)
	 	{
	 		driver.quit();
	 	}
	 	
	
}
