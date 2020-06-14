package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Oneway {
	
	
	WebDriver dr;
	String  username="srishtisdgdfsd";
	String  password="srishtisdfsdf";

	@BeforeClass
	
	public void launchApplication()
	{
System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		
		 dr=new ChromeDriver();//initialize browser
		dr.manage().window().maximize();
	}
	
	
	
	/*@AfterClass
	public void closeApplication()
	{
		dr.quit();
	}
	*/
	@Test
	public void login()
	{	
		dr.get("http://newtours.demoaut.com/");//hit url
		
		WebElement username =dr.findElement(By.name("userName")); //webElement id interface
		
		username.sendKeys(this.username);
		WebElement password=dr.findElement(By.name("password"));
		password.sendKeys(this.password);
		
		WebElement signIn=dr.findElement(By.name("login"));
	signIn.click();
		
	}
	
	@Test(dependsOnMethods={"login"})
			public void flightDetails()
	{
		
		WebElement oneway=  dr.findElement(By.xpath("//input[@value='oneway']")); //radio button
		oneway.click();
		
		WebElement pass=dr.findElement(By.xpath("//select[@name='passCount']"));
		
		Select sel= new Select(pass);
		
		sel.selectByIndex(2);
		
		
		WebElement depart=dr.findElement(By.xpath("//select[@name='fromPort']"));
		Select sel2=new Select(depart);
		sel2.selectByVisibleText("London");
		
		
dr.findElement(By.xpath(xpathExpression))
		
		
				
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
