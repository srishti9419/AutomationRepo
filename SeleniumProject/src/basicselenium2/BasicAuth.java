package basicselenium2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import banking.CustomerLogin;

public class BasicAuth {
	
	WebDriver dr;

	@Test(enabled=false)
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		dr= new ChromeDriver();
		dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Thread.sleep(4000);
		dr.findElement(By.name("proceed")).click();
		
		Alert alt=dr.switchTo().alert();
		String text=alt.getText();
		Assert.assertEquals(text, "Please enter a valid user name");
		
		alt.accept(); //click on OK btn

	}
	
	@Test
	public void calender() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		dr= new ChromeDriver();
		dr.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		
	/*	String date="15-May-2017";
		String arr[]=date.split("-");
		String day=arr[0];
		String month=arr[1];
		String year=arr[2];
		
		Select sel=new Select(dr.findElement(By.name("birthday_day")));
		sel.selectByVisibleText(day);
		Select sel1=new Select(dr.findElement(By.name("birthday_month")));
		sel1.selectByVisibleText(month);
		Select sel2=new Select(dr.findElement(By.name("birthday_year")));
		sel2.selectByVisibleText(year);*/
		
		Thread.sleep(3000);
		//dr.switchTo().frame(1);
		
		WebDriverWait wait= new WebDriverWait(dr,30);
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//button[text()='Customer Login']")))).click();
		
		
		
		
	}
	
	
	
	
	
	
	

}
