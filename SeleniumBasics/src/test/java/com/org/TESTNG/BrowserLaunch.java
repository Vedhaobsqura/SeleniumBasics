package com.org.TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserLaunch {
	
	WebDriver driver;

	public void intialiseBrowser(String Browser)
	{
		if(Browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(Browser.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		else if(Browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
			throw new RuntimeException("INVALID EXCEPTION");
		driver.manage().window().maximize();
	}
@BeforeMethod

	public void setUp()
	{
		intialiseBrowser("Chrome");
	}

@AfterMethod
	public void closeBrowser()
	{
		driver.close();
		
	}
	}


