package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.TestUtil;

public class Base {
	
	public static WebDriver dr;
	public static Properties prop;
	
	public Base(WebDriver dr)

	{
		PageFactory.initElements(dr, this);
	
	}
		
	}


