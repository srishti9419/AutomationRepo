package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseHover {
	
	@Test
	
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		dr.get("https://www.flipkart.com");
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Actions act=new Actions(dr);
		act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();
		
		dr.findElement(By.xpath("//a[text()='Shirts']")).click();
		
		WebDriverWait wait= new WebDriverWait(dr,5);
		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[2]")), 70, 0).build().perform();
	
		
		
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='_3togXc']"))).click();
	}

}
