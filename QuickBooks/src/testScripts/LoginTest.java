package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import configProperties.Configuration;
import library.AppkicationLib;
import pages.ObjectOfAllPages;

public class LoginTest {
	
ObjectOfAllPages pages;
AppkicationLib lb;

WebDriver dr;



@BeforeClass
public void setup() 
{
	lb=new AppkicationLib();
	
	dr=lb.browser("chrome");
	pages=new ObjectOfAllPages(dr);
	
	Assert.assertNotNull(dr);
	
	
	
}
@Test
public void loginTest( )
{
dr.get(Configuration.preprodpath);
	
	pages.prepodlogin.login(Configuration.usernameDC4, Configuration.passwordDC4);

	
	
}


}
