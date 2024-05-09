package org.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class EdgeBrowser {

	public static void main(String[] args) {
	
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.seleniumeasy.com/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	String address=	driver.getWindowHandle();
	System.out.println(address);
	
	String pagecode=driver.getPageSource();
System.out.println(pagecode);

driver.close();

	}

}
