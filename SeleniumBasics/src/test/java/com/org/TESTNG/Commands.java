package com.org.TESTNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		WebElement genderm=driver.findElement(By.xpath("//input[@id='gender-female']"));
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
	@Test
	public void verifyJavaScriptExecutorSendkeysandClick()
	{
		driver.get("https://demowebshop.tricentis.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById(\"newsletter-email\").value='vedha@gmail.com'");
		js.executeScript("document.getElementById(\"newsletter-subscribe-button\").click()");
	}
	@Test
	public void verifyScroll()
	{
		driver.get("https://demowebshop.tricentis.com");
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	@Test
	public void verifyLoginJavaScriptExecutor()
	{
		driver.get("https://demowebshop.tricentis.com/login");
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("document.getElementById(\"Email\").value='Kottolathil@gmail.com'");
		js2.executeScript("document.getElementById(\"Password\").value='demowebshop96#A'");
		
		
	}
	
	@Test
	public void verifyRobotClass() throws AWTException
	{
		driver.get("https://demowebshop.tricentis.com");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	
	}
	@Test
	public void verifyDynmaicWebTable()
	{
		driver.get("https://money.rediff.com/indices/nse");
		//show more click
		WebElement showmore=driver.findElement(By.id("showMoreLess"));
		showmore.click();
		//nse indeces table
		WebElement nsetable=driver.findElement(By.xpath("//table[@id='dataTable']"));
		//to get all the data from nse indeces
		//System.out.println(nsetable.getText());
		//to get particular row
		WebElement nseindecesonerow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
		System.out.println(nseindecesonerow.getText());
		//how much row is there
		List<WebElement>rows=nsetable.findElements(By.tagName("tr"));
		int rowcount=rows.size();
		//in each row we have to find the columns for the value we needed
		for(int i=0;i<rowcount;i++)
		{
			//inside row of column
			List<WebElement>columns=rows.get(i).findElements(By.tagName("td"));
			int columncount=columns.size();
		
		for(int j=0;j<columncount;j++)
		{
			String celltype=columns.get(j).getText();
			if(celltype.equals("NIFTY NEXT 50"))
			{
			System.out.println("Previous close value is:"+columns.get(1).getText());	
			}
		}
		}
		
		
		
		}
	
	
	
	
	@Test
	public void verifyWaits() 
	{
	driver.get("https://demoqa.com/alerts");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='timerAlertButton']")));
	WebElement alertclickme=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
	alertclickme.click();
	wait.until(ExpectedConditions.alertIsPresent());
	Alert alert=driver.switchTo().alert();
	alert.accept();
		
		
		
		
		
		
		
		
		
		
}
}
