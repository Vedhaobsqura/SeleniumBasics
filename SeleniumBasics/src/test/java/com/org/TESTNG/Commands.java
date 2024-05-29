package com.org.TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Commands extends BrowserLaunch
{

	@Test
	public void verifyHomePageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		String actualpagetitle=driver.getTitle();
		System.out.println("The title of the webpage is:"+actualpagetitle);
		String expectedtitle="Demo Web Shop";
		//String expectedtitle="Demo Web shop";
		Assert.assertEquals(actualpagetitle,expectedtitle,"TITLE MISMATCH");;
	}
	
	@Test
	public void verifyLoginDetails()
	{
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("Kottolathil@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		password.sendKeys("demowebshop96#A");
		WebElement loginbtn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		loginbtn.click();
		WebElement emailhomescreen=driver.findElement(By.xpath("//a[text()='Kottolathil@gmail.com']"));
		String actual=emailhomescreen.getText();
		String expected="Kottolathil@gmail.com";
		//String expected="Kottolathil@gmail.comm";
		Assert.assertEquals(actual,expected,"Username Matching as per user information");
		
	}
	
	@Test
	public void verifyGenderDetails()
	{
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement genderm=driver.findElement(By.xpath("//input[@id='gender-male']"));
		//genderm.click();   java.lang.AssertionError: Gender as Male is selected by the user expected [false] but found [true]
		Boolean notselected=genderm.isSelected();
		Assert.assertFalse(notselected, "Gender as Male is selected by the user");
		genderm.click();
		Boolean selected=genderm.isSelected();
		Assert.assertTrue(selected, "Gender as Male is not selected by the user");
		
		
	}
	
	@Test
	public void verifySubscribeDetails()
	{
		driver.get("https://demowebshop.tricentis.com");	
		WebElement subscribebuttonenamed=driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
		Boolean subbtn=subscribebuttonenamed.isEnabled();
		Assert.assertTrue(subbtn);
		
		
	}
	@Test
	public void verifyVoteDetails()
	{
		driver.get("https://demowebshop.tricentis.com");	
		WebElement subscribebuttonenamed=driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
		Boolean votebtn=subscribebuttonenamed.isDisplayed();
		//Assert.assertFalse(votebtn,"Vote button is displayed");
		Assert.assertTrue(votebtn);
	}
	
	@Test
	public void verifysaucetitle()
	{
		driver.get("https://www.saucedemo.com/");
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement logbtn=driver.findElement(By.id("login-button"));
		logbtn.click();
		WebElement swagtext=driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		String Actual=swagtext.getText();
		String Expected="Swag Labs";
		Assert.assertEquals(Actual,Expected,"TITLE IS NOT MATCHING AS PER USER ENTRY");
	}
	
}
