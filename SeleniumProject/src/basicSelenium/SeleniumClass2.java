package basicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumClass2 {
	
	@Test
	public void selectTripType() throws InterruptedException
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
	
	WebElement oneway=  dr.findElement(By.xpath("//input[@value='oneway']")); //radio button
	System.out.println(oneway.isSelected());
	oneway.click();
	
	System.out.println(oneway.isSelected());
	
	//dropdown
	WebElement pass=dr.findElement(By.xpath("//select[@name='passCount']"));
	
	Select sel= new Select(pass);
	
	sel.selectByIndex(2);
	
	Thread.sleep(2000);
	sel.selectByValue("1");
	Thread.sleep(2000);
	sel.selectByVisibleText("2");
	Thread.sleep(2000);
	
	   dr.findElement(By.xpath("//input[@name='findFlights']")).click();
	   dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
	   
	   WebElement ticketless=  dr.findElement(By.xpath("//input[@name='ticketLess']")); //radio button
		System.out.println(ticketless.isSelected());
		ticketless.click();
		
		System.out.println(ticketless.isSelected());
		
		
		dr.findElement(By.xpath("[@name='passFirst0']")).sendKeys("srishti");
		dr.findElement(By.xpath("[@name='passLast0']")).sendKeys("rathore");
		
		
		
		/*
		WebElement country=dr.findElement(By.xpath("//select[@name='delCountry']"));
		
		Select sel2= new Select(country);
		
		sel2.selectByVisibleText("UNITED STATES");
		Alert alt= dr.switchTo().alert();
		
		System.out.println(alt.getText()); 
		alt.accept();*/
		
		dr.findElement(By.xpath("//input[@name='buyFlights']")).click();
		
		
			   
			   
			   
			   
		//dr.close();
		
	}

}
