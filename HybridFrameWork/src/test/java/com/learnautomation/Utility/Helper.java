package com.learnautomation.Utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper 
	{
	public static void CaptureScreenshot(WebDriver driver)
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try 
		{
			FileHandler.copy(src, new File("./ScreenShots/eCommerce "+getCurrentDateTime()  + ".png"));
		} 
		catch (IOException e) 
		{
			System.out.println("Unable to capture screenshot "+e.getMessage());
		}
	}
	
	public static String getCurrentDateTime()

	{
		DateFormat customFormat =new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return customFormat.format(currentDate);
	}
}
