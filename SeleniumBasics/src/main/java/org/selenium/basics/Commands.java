package org.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Commands 
{

	
	public void verifySwaglabs()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginbtn=driver.findElement(By.id("login-button"));
		loginbtn.click();
	
	}
	
	public void verifyDemoShop()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement Loginbtntri=driver.findElement(By.className("ico-login"));
		Loginbtntri.click();
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("Kottolathil@gmail.com");
		WebElement pwd=driver.findElement(By.id("Password"));
		pwd.sendKeys("demowebshop96#A");
		WebElement loginbtn=driver.findElement(By.className("login-button"));
		loginbtn.click();
		
	}
	
	
	public static void main(String[] args)
	{
		Commands obj= new Commands();
			
		//obj.verifySwaglabs();
		obj.verifyDemoShop();
	}

}
