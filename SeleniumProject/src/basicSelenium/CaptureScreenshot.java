package basicSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class CaptureScreenshot {
	
	
@Test
	public void test1() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		dr.get("https://www.flipkart.com");
		
		
		
		String path="D:\\AutomationRepo\\SeleniumProject\\src\\basicSelenium\\test1.jpg";
		
		TakesScreenshot scrshot= (TakesScreenshot) dr;
		
		File scrfile=scrshot.getScreenshotAs(OutputType.FILE);
		
		File desFile=new File(path);
		FileHandler.copy(scrfile, desFile);

}

}
