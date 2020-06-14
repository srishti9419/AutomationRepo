package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumClass {
	
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("http://newtours.demoaut.com/");
		WebElement username =dr.findElement(By.name("userName")); //webElement id interface
	
		username.sendKeys("mercury");
		WebElement password=dr.findElement(By.name("password"));
		password.sendKeys("mercury");
		
		WebElement signIn=dr.findElement(By.name("login"));
	signIn.click();
	
	   dr.findElement(By.xpath("//input[@value='oneway']"));
	   
	   dr.findElement(By.xpath("//input[@value='First']")).click();;
			   
			   
			   
			   
		//dr.close();
		
	}
		
		
		
		
	}


