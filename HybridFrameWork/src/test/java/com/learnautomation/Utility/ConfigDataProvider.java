package com.learnautomation.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	
	public ConfigDataProvider()

	{
		File src = new File("./Configuration/config.properties");
		try 
			{
			FileInputStream fis = new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);			
			} 
		catch (Exception e) 
			{
			System.out.println("Unable to Load Config file "+e.getMessage());
			}
	}
	
	public String getDataFromConfig(String KeyToSearch)
	{
		return pro.getProperty(KeyToSearch);
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String getQAUrl()
	{
		return pro.getProperty("QaUrl");
	}
	
}
