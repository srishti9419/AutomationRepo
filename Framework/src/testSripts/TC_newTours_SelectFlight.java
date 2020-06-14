package testSripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.Pages;
import configration.Config;
import library.ApplicationLibrary;


public class TC_newTours_SelectFlight {
	
	WebDriver dr;
	ApplicationLibrary lib;
	Pages page;
	
	@BeforeClass
	public void setup() throws IOException
	{
		lib=new ApplicationLibrary();
		dr=lib.launchApplication("chrome");
		page=new Pages(dr);
		Assert.assertNotNull(dr);
	
	
		
	}
	
	
@Test
	
	public void loginTest() throws IOException
	{
	dr.get(Config.url);
	
	//login
	String rt=	page.homepage.login(Config.globalUsername, Config.globalPassword);
	
	Assert.assertEquals(rt, "Find a Flight: Mercury Tours:");
	}


@Test

public void selectPassengerTest()
{
	String pass=page.selectFlight.selectPassenger(Config.passcount);
	
	boolean rt=lib.isElementPresent(dr, page.selectFlight.SelectPssnger);
	
	Assert.assertEquals(rt, true);
	
}

@Test
public void selectDepartFromTest()
{
	String loc=page.selectFlight.selectDepartFrom(Config.location);
	boolean rt=lib.isElementPresent(dr, page.selectFlight.SelectDepartFrom);
	Assert.assertEquals(rt, true);
	
	
	
}
@Test

public void selectMonthTest()
{
	boolean loc=page.selectFlight.selectMonth(Config.Month);
	
	Assert.assertEquals(loc, true);
	
	
}

@Test

public void selectDateTest()
{
	String loc=page.selectFlight.selectDate(Config.date);
	boolean rt=lib.isElementPresent(dr, page.selectFlight.SelectDate);
	Assert.assertEquals(rt, true);
	
}

/*@Test
public void businesclassTest()
{
	
	boolean ret=page.selectFlight.businessClass();
	Assert.assertEquals(ret, true);
}

*/
@Test
public void fistclastest() throws InterruptedException
{
	Thread.sleep(30);
	
	page.selectFlight.firstClass();
	//Assert.assertEquals(ret, true);
}
}
