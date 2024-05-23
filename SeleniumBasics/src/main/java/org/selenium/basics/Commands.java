package org.selenium.basics;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
	
	
	public void verifyIsSelected()
	{
		boolean isButtonSelected;
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		WebElement femaleradiobutton=driver.findElement(By.xpath("//input[@id='gender-female']"));
		isButtonSelected=femaleradiobutton.isSelected();
		System.out.println("Female radiobutton before selection:"+isButtonSelected);
		femaleradiobutton.click();
		isButtonSelected=femaleradiobutton.isSelected();
		System.out.println("Female radiobutton after selection:"+isButtonSelected);;
		driver.close();
		
	}
	
	public void verifyIsEnabled()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement subscribebutton=driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
		boolean isenabled=subscribebutton.isEnabled();
		System.out.println("Subscribe button is enabled:"+isenabled);
		driver.close();	
		
	}
	
	
	public void verifyIsDisplayed()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement votebutton=driver.findElement(By.xpath("//input[@class='button-2 vote-poll-button']"));
		boolean isdispalyed=votebutton.isDisplayed();
		System.out.println("vote button is dispalyed:"+isdispalyed);
		
	}
	
	
	
	
	public void verifyValueFromDropdown()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement countrydrpdown=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(countrydrpdown);
		//select.selectByVisibleText("ANDORRA");
		//select.selectByIndex(5);
		select.selectByValue("AMERICAN SAMOA");		
		WebElement getcountryname=select.getFirstSelectedOption();
		System.out.println(getcountryname.getText());
		
		
	}
	
	public void verifySimpleMethod()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement alertclickmebtn=driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertclickmebtn.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.close();
	}
	
	
	public void verifyConfirmationAlert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement promptclickmebtn=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		promptclickmebtn.click();
		Alert alert=driver.switchTo().alert();
		String confirmationalerttext=alert.getText();
		System.out.println("Confirmation alert text is:"+confirmationalerttext);
		alert.dismiss();
		WebElement dismisstext=driver.findElement(By.xpath("//span[@id='promptResult']"));
		String dtext=dismisstext.getText();
		System.out.println("After selecting okay alert the text is:"+dtext);
		
	}
	
	public void verifyPromptAlert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();	
		WebElement promptalert=driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptalert.click();
		Alert alert=driver.switchTo().alert();
		String promptalerttext=alert.getText();
		System.out.println("Prompt alert text is:"+promptalerttext);
		alert.sendKeys("Vedha");
		alert.accept();
		WebElement accepttext=driver.findElement(By.xpath("//span[@id='confirmResult']"));
		String acceptpromttext=accepttext.getText();
		System.out.println("After selecting okay alert the text is:"+acceptpromttext);
		
				
	}
	
	public void verifyCustomerForm()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();	
		WebElement custid= driver.findElement(By.xpath("//input[@name='cusid']"));
		custid.sendKeys("12345");
		WebElement submitbtn=driver.findElement(By.xpath("//input[@name='submit']"));
		submitbtn.click();
		Alert alert=driver.switchTo().alert();
		String alerttextbox=alert.getText();
		System.out.println("Alerrt message is:"+alerttextbox);
		alert.accept();
		String alertdelete=alert.getText();
		System.out.println("Alerrt message is:"+alertdelete);
		alert.accept();
		
		
	}
	
	public void verifyRightClick()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();	
		WebElement rightclick= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightclick).build().perform();//build method is to perform chain of operations or actions  //perform execute the builda action
	driver.close();
	
	}
	
	public void verifyDoubleClick()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions actions=new Actions(driver);
		actions.doubleClick(doubleclick).build().perform();
		Alert alert=driver.switchTo().alert();
		String alerttextbox=alert.getText();
		System.out.println("Alert message is:"+alerttextbox);
		alert.accept();
		driver.close();
	}
	
	
	public void verifyDragandDrop()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@class='drop-box ui-droppable']"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(drag, drop).build().perform();
		driver.close();
		
	}
	
	
	public void verifyDragandDropoffset()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/dragabble");
		driver.manage().window().maximize();
		WebElement drag=driver.findElement(By.xpath("//div[@id='dragBox']"));
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(drag,50,100).build().perform();
		
		
	}
	
	public void verifyMouseHovering()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/menu/");
		driver.manage().window().maximize();	
		WebElement mainitem2hover=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(mainitem2hover).build().perform();
		WebElement submenuhover=driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		Actions actions1=new Actions(driver);
		actions1.contextClick(submenuhover).build().perform();
		
		}
	
	
	//src/main/resources-showin=systemexplorer-copy the file there-close-refresh the project
	public void verifyFileUpload()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();	
		WebElement choosefile= driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		choosefile.sendKeys("C:\\Users\\Vedha\\git\\SeleniumBasics\\SeleniumBasics\\src\\main\\resources\\Selenium Notes_Vedha.K.docx");
		WebElement acceptfile= driver.findElement(By.xpath("//input[@id='terms']"));
		acceptfile.click();
		WebElement submitbtn= driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submitbtn.click();
		driver.close();	
	}
	
	
	
	
	public void verifyMultipleDraggable()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/drag-drop.php");
		driver.manage().window().maximize();
		WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement drag2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		WebElement drag3=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		WebElement drag4=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions1=new Actions(driver);
		actions1.dragAndDrop(drag1, drop).build().perform();
		actions1.dragAndDrop(drag2, drop).build().perform();
		actions1.dragAndDrop(drag3, drop).build().perform();
		actions1.dragAndDrop(drag4, drop).build().perform();
		
		
		
		
		
		
		
		
	}
	public static void main(String[] args)
	{
		Commands obj= new Commands();
			
		//obj.verifySwaglabs();
		//obj.verifyDemoShop();
		//obj.verifyDestination();
		//obj.VerifyPartialDestination();
		//obj.Verifymercuryregisteration();
		//obj.verifyDemoWebShop();
		//obj.verifyIsSelected();
		//obj.verifyIsEnabled();
		//obj.verifyIsDisplayed();
		//obj.verifyValueFromDropdown();
		//obj.verifySimpleMethod();
		//obj.verifyConfirmationAlert();
		//obj.verifyPromptAlert();
		//obj.verifyCustomerForm();
		//obj.verifyRightClick();
		//obj.verifyDoubleClick(); 
		//obj.verifyDragandDrop();
		//obj.verifyDragandDropoffset();
		//obj.verifyMouseHovering();
		//obj.verifyFileUpload();
		obj.verifyMultipleDraggable();
	}

}
