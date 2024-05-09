package org.selenium.basics;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
public class FirefoxBrowser {

	public static void main(String[] args)
	{
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/");
		driver.manage().window().maximize();
		
		String ptitle=driver.getTitle();
		System.out.println(ptitle);
		
		
		String curl=driver.getCurrentUrl();
		System.out.println(curl);
		
	String waddress=	driver.getWindowHandle();
	System.out.println(waddress);
	
	String pagecode=driver.getPageSource();
    System.out.println(pagecode);

    driver.close();


	}

}
