package com.org.TESTNG;

import org.testng.annotations.Test;

public class Commands extends BrowserLaunch
{

	@Test
	public void verifyHomePageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/fiction");
		String pagetitle=driver.getTitle();
		System.out.println("The title of the webpage is:"+pagetitle);
	}
}