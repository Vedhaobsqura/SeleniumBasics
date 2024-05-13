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
	
	
	public void verifyDemoWebShop()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/fiction");
		driver.manage().window().maximize();
		//absolutexpath
		WebElement login=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
		login.click();
		WebElement email=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/input"));
		email.sendKeys("Kottolathil@gmail.com");
		WebElement pwd=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[3]/input"));
		pwd.sendKeys("demowebshop96#A");
		WebElement loginbtn=driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.customer-blocks > div.returning-wrapper > div.form-fields > form > div.buttons > input"));
		loginbtn.click();
		
	}
	public void Verifymercuryregisteration()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement firstname=driver.findElement(By.name("firstName"));
		firstname.sendKeys("Vedha");
		WebElement lastname=driver.findElement(By.name("lastName"));
		lastname.sendKeys("K");
		WebElement phone=driver.findElement(By.name("phone"));
		phone.sendKeys("8248289516");
		WebElement email=driver.findElement(By.id("userName"));
		email.sendKeys("Kottolathil@gmail.com");
		WebElement address=driver.findElement(By.name("address1"));
		address.sendKeys("abcderd");
		WebElement city=driver.findElement(By.name("city"));
		city.sendKeys("Bangalore");
		WebElement state=driver.findElement(By.name("state"));
		state.sendKeys("Karnataka");
		WebElement postco=driver.findElement(By.name("postalCode"));
		postco.sendKeys("560093");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("Kottolathil@gmail.com");
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("Kottolathil@gmail.com");
		WebElement conpwd=driver.findElement(By.name("confirmPassword"));
		conpwd.sendKeys("Kottolathil@gmail.com");
		WebElement submbtn=driver.findElement(By.name("submit"));
		submbtn.click();
		
	}
	public void verifyDestination()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		WebElement dest=driver.findElement(By.linkText("your destination"));
		dest.click();
			
	}
	
	public void VerifyPartialDestination()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		WebElement des1=driver.findElement(By.partialLinkText("your destination"));
		des1.click();
	}
	public static void main(String[] args)
	{
		Commands obj= new Commands();
			
		//obj.verifySwaglabs();
		//obj.verifyDemoShop();
		//obj.verifyDestination();
		//obj.VerifyPartialDestination();
		//obj.Verifymercuryregisteration();
		obj.verifyDemoWebShop();
	}

}
