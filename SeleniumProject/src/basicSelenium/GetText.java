package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetText {
	
	@Test
	
	public void Test1()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		
		 ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://newtours.demoaut.com/");
		
	String date=dr.findElement(By.xpath("//td/font[@face='Arial, Helvetica, sans-serif, Verdana']/b")).getText();
	System.out.println(date);
	 
	 
	 
	}

}
