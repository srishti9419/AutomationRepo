package library;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

import configration.Config;

public class ApplicationLibrary {
	
/** Author : Srishti Rathore
	 * Date : 11/30/2019
	 * Description : this function will help to check the pre
	 *Param : WebDriver instance and by object
	 *Ret : boolean
	 */
	
	
	
	public WebDriver launchApplication(String browserName)
	
	{
		WebDriver dr=null;
		
		if(browserName.equals("chrome"))
		{
System.setProperty("webdriver.chrome.driver",Config.chromeDriverPath);
		
		
		 dr=new ChromeDriver();
		dr.manage().window().maximize();
		
	}
	
		
	else if(browserName.equals("IE"))
	{
System.setProperty("webdriver.ie.driver",Config.IEpath);
	
	
	 dr=new InternetExplorerDriver();
	dr.manage().window().maximize();
	
}

	else if(browserName.equals("firefox"))
	{
System.setProperty("webdriver.gecko.driver",Config.firefoxpath);
	
	
	 dr=new FirefoxDriver();
	dr.manage().window().maximize();
	
}
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
/*	else if(browserName.equals("edge"))
	{
System.setProperty("webdriver.chrome.driver",Config.edgepath);
	
	
	 dr=new EdgeDriver();
	dr.manage().window().maximize();
	
}*/

	return dr;	
		
	}
	
	public boolean isElementPresent(WebDriver dr, WebElement element)
	{
		
		Boolean ret=false;
		try
		{
		if(element.isDisplayed())
		
			ret=true;
		}
		
		catch(NoSuchElementException e)
		{
			ret=false;
		}
		
		return ret;

	}
	
	public String capturScreenshot(WebDriver dr,String name) throws IOException
	{
		String timeStamp= new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

		
		String path=Config.screenshot+name+timeStamp+".png";
TakesScreenshot scrshot= (TakesScreenshot) dr;
		
		File scrfile=scrshot.getScreenshotAs(OutputType.FILE);
	
		File desFile=new File(path);
		
		FileHandler.copy(scrfile, desFile);
		return path;
		
		
	}

	
	}
	




