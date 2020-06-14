package testSripts;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.Pages;
import configration.Config;

import library.ApplicationLibrary;
import testData.Xls_Reader;

public class TC_NewTours_LoginSignOff {
	
	WebDriver dr;
	ApplicationLibrary lib;
	Pages page;
	Xls_Reader xl;
	
	
	@BeforeClass
	
	public void setup() throws IOException
	{
		lib=new ApplicationLibrary();
		dr=lib.launchApplication("chrome");
		
		//intializing page
		page=new Pages(dr);
		
		//initialize xl reader
		xl=new Xls_Reader(Config.testDataPath);
		//validation
		Assert.assertNotNull(dr);
		lib.capturScreenshot(dr, "Launch Browser");
	
		
	}

	@Test
	
	public void loginTest() throws IOException
	{
		dr.get(Config.url);
		//login
	String rt=	page.homepage.login(Config.globalUsername, Config.globalPassword);
	
	Assert.assertEquals(rt, "Find a Flight: Mercury Tours:");
	lib.capturScreenshot(dr, "login");
	}
	
	
/*	@Test(dependsOnMethods={"loginTest"})
	public void logout() throws IOException
	{
		//click on logout
		page.flightfinder.signoff();
		
		//validation
		boolean ret=lib.isElementPresent(dr, page.homepage.username);
		Assert.assertEquals(ret, true);
		lib.capturScreenshot(dr, "logout");
	}
	*/
	@Test(dependsOnMethods={"loginTest"})
	
	public void onewayTest()
	{
		boolean res=page.flightfinder.selectOneWay();
		
		Assert.assertEquals(true, res);
		
	}
	
	
	//@Test(dependsOnMethods={"loginTest"})
	public void roundtripTest()
	{
		boolean res=page.flightfinder.Roundtrip();
		Assert.assertEquals(true, res);
	}
	
	
	
/*	@AfterClass
	public void tearoff()
	{
		dr.close();
	}*/
}
