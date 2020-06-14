package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleIframe {
	
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
			
			
			ChromeDriver dr=new ChromeDriver();//initialize  dirver
			dr.manage().window().maximize();
			
			dr.get("https://ui.freecrm.com/");
			
			Thread.sleep(4000);
			
			//dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
			
			Thread.sleep(10000);
			
			//dr.switchTo().frame(0);
			
			dr.findElement(By.xpath("//input[@name='email']")).sendKeys("srishtirahore");
			//dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
	}
	

}
