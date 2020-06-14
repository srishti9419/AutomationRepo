package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {
@Test
	
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		dr.get("https://www.flipkart.com");
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)dr;
		
		WebElement ele=dr.findElement(By.xpath("//a[text()='Contact Us']"));
		
		
		js.executeScript("arguments[0].scrollIntoView();", ele);

}

}
