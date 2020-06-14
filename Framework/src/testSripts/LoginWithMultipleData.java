package testSripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.Pages;
import configration.Config;
import library.ApplicationLibrary;
import testData.Xls_Reader;

public class LoginWithMultipleData {
	
	WebDriver dr;
	ApplicationLibrary lib;
	Pages page;
	Xls_Reader xl;
	
	
	@BeforeClass
	
	public void setup() throws IOException
	{
		lib=new ApplicationLibrary();
		//lauch browser
		dr=lib.launchApplication("chrome");
		
		//intializing page
		page=new Pages(dr);
		
		//initialize xl reader
		xl=new Xls_Reader(Config.testDataPath);
		//validation
		Assert.assertNotNull(dr);
		//lib.capturScreenshot(dr, "Launch Browser");
	
		
	}

	@Test(dataProvider="getData")	
	public void loginTest( String username,String password) throws IOException
	{
		dr.get(Config.url);
		//login
	String rt=	page.homepage.login(username, password);
	
	Assert.assertEquals(rt, "Find a Flight: Mercury Tours:");
	lib.capturScreenshot(dr, "login");
		
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@Test(dependsOnMethods={"loginTest"})
	public void logout() throws IOException
	{
		//click on logout
		page.flightfinder.signoff();
		
		//validation
		boolean ret=lib.isElementPresent(dr, page.homepage.userName);
		Assert.assertEquals(ret, true);
		lib.capturScreenshot(dr, "logout");
	}
	
	
	@AfterClass
	public void tearoff()
	{
		dr.close();
	}
	
	@DataProvider
	public String[][] getData() throws IOException
	{
		int rows=xl.getRowCount("Login");
		int cols=xl.getColumnCount("Login");
		
		System.out.println(rows);
		System.out.println(cols);
		String[][] data=new String[rows-1][cols];
		
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				data[r-2][c-1]=xl.getCellData("Login", r, c);
			}
		}
		return data;
	}
}



