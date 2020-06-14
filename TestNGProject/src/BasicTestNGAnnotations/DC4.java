package BasicTestNGAnnotations;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DC4 {
	
	
	
	WebDriver driver;
	
	@Test
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		
		driver.get("https://commerce.spscommerce.com/xrefs/data/");
		/*
		int total_frame=driver.findElements(By.tagName("iframe")).size();
		System.out.println("total number of fram"+total_frame);*/
		
	
		
		driver.switchTo().frame(0);
		//WebDriverWait wait=new WebDriverWait(driver,30);
		
		driver.manage().timeouts().implicitlyWait(20000,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("srathore@spscommerce.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Radhe@radhe1");
	
	Thread.sleep(2000);
	

	
	driver.findElement(By.xpath("//span[text()='Sign In']")).click();
	//driver.switchTo().defaultContent();
	Thread.sleep(2000);

	driver.manage().window().maximize();

	
	//driver.findElement(By.xpath("//span[text()='XREFs']")).click();
	
	

List<WebElement> st=driver.findElements(By.tagName("iframe"));
System.out.println(st.size());


try{
	driver.switchTo().frame("app-xrefs-y2z4yy");
	
	
}
catch(NoSuchFrameException e)
{
	System.out.println("handled exception");
}
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//Thread.sleep(2000);

	//WebElement dd=driver.findElement(By.xpath("/html/body/intapps-app/ia-navbar/div/nav/ng-transclude/ia-env-selector/ia-select/div/div[1]/div[1]/span/span"));

WebElement dd=driver.findElement(By.xpath("/html/body/intapps-app/div/ui-view/xref-data-search/ui-view/ngf-search-form/form/div/div[1]/ng-transclude/div/div[1]/label/ia-autocomplete/div"));
	
	dd.sendKeys("hhl");
	//driver.findElement(By.xpath("//span[text()='PreProduction']")).click();
	
	
	
	
	
	}
}
