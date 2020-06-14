package library;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import configProperties.Configuration;



public class AppkicationLib {
	
	
	
	public WebDriver browser( String Browser)
	
	{
WebDriver dr=null;
		
		if(Browser.equals("chrome"))
		{
System.setProperty("webdriver.chrome.driver",Configuration.chromeDriverPath1);
		
		
		 dr=new ChromeDriver();
		dr.manage().window().maximize();
		
	}
	
	/*	
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
	
}*/
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
/*	else if(browserName.equals("edge"))
	{
System.setProperty("webdriver.chrome.driver",Config.edgepath);
	
	
	 dr=new EdgeDriver();
	dr.manage().window().maximize();
	
}*/

	return dr;	
		
	}
	
	public boolean isElementPresent(WebDriver dr,By element)
	{
	int size=	dr.findElements(element).size();
	if(size>0){
		return true;
	}
	else
	{
		return false;
	}
	}
	
}