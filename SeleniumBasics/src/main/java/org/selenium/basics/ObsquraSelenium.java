package org.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ObsquraSelenium 
{
	public void homeobs()
	{

	WebDriver driver =new ChromeDriver();
	driver.get("https://selenium.qabible.in/index.php");
	driver.manage().window().maximize();
	String pagetitle=driver.getTitle();
	System.out.println(pagetitle);
	WebElement inputform=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/nav/div/ul/li[2]/a"));
	inputform.click();
	WebElement singleinfield=driver.findElement(By.id("single-input-field"));
	singleinfield.sendKeys("This is single input field");
	WebElement showmsgbtn1=driver.findElement(By.cssSelector("button[id='button-one']"));
	showmsgbtn1.click();
	WebElement twoinputfield=driver.findElement(By.xpath("//div[@class='form-group']//input[@id='value-a']"));
	twoinputfield.sendKeys("4");
	WebElement twoinputfieldb=driver.findElement(By.cssSelector("input#value-b"));
	twoinputfieldb.sendKeys("4");
	WebElement showmsgbtn2=driver.findElement(By.cssSelector("button#button-two"));
	showmsgbtn2.click();
	WebElement checkboxlink=driver.findElement(By.linkText("Checkbox Demo"));
	checkboxlink.click();
	WebElement singlecheckdemo= driver.findElement(By.xpath("//input[@type='checkbox' and @id='gridCheck']"));
	singlecheckdemo.click();
	Boolean singledemocheckbox=singlecheckdemo.isSelected();
	System.out.println("Single checkbox demo is selected by the user:"+singledemocheckbox);
	WebElement checkboxone= driver.findElement(By.xpath("//div[@class='form-check']//input[@id='check-box-one']"));
	checkboxone.click();
	WebElement selectallbtn= driver.findElement(By.xpath("//input[@id='button-two' and @value='Select All']"));
	Boolean selectbtn=selectallbtn.isEnabled();
	System.out.println("Select All button is enabled before clicking:"+selectbtn);
	selectallbtn.click();
	System.out.println("Select All button is enabled after clicking:"+selectbtn);
	WebElement radiobtndemo=driver.findElement(By.partialLinkText("Radio Buttons")); 
	radiobtndemo.click();
	WebElement showselectedvaluebtn=driver.findElement(By.xpath("//button[@id='button-one']"));
	Boolean selectedvaluecheckbox=showselectedvaluebtn.isSelected();
	System.out.println("Radiobuttondemo checkbox before user selection:"+selectedvaluecheckbox);
	WebElement malecheckbox=driver.findElement((By.xpath("//div[@class='form-group']//input[@id='inlineRadio1']//following-sibling::label")));
	malecheckbox.click();
	showselectedvaluebtn.click();
	Boolean selectedvaluemalecheckbox=showselectedvaluebtn.isSelected();
	System.out.println("Radiobuttondemo checkbox before user selection:"+selectedvaluemalecheckbox);
	WebElement getresultbtn=driver.findElement(By.cssSelector("button#button-two"));
	Boolean getresbtn=getresultbtn.isDisplayed();
	System.out.println("Getresultbutton is displayed:"+getresbtn);
	WebElement selectinputlink=driver.findElement(By.linkText("Select Input"));
	selectinputlink.click();
	WebElement color=driver.findElement(By.xpath("//div[@class='form-group']//select[@id='single-input-field']"));
	Select selectcolor=new Select(color);
	selectcolor.selectByIndex(0);
	selectcolor.selectByValue("Yellow");
	selectcolor.selectByVisibleText("Green");
	WebElement getcolor=selectcolor.getFirstSelectedOption();
	System.out.println(getcolor.getText());
	}
	public static void main(String[] args) 
	{
		ObsquraSelenium obj= new ObsquraSelenium ();
		obj.homeobs();

	}
//
}
