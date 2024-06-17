package com.learnautomation.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TCwithoutFramework {
		 public static void main(String[] args)
		 {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\prath\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://www.kickresume.com/edit/9880674/fill-in/");
			 System.out.println(driver.getTitle());
			 System.out.println(driver.getCurrentUrl());
			 driver.quit();		 
		 }
	}
