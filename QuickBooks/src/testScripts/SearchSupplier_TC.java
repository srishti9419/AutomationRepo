package testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import configProperties.Configuration;
import library.AppkicationLib;
import pages.ObjectOfAllPages;
import utilities.Excel_utility;

public class SearchSupplier_TC {
	
	ObjectOfAllPages pages;
	AppkicationLib lb;

	Excel_utility xl;
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
		dr.switchTo().frame(0);
		dr.findElement(By.xpath("//*[@id='form1:menuTabs1:0:commandMenuItem1']")).click();

		
		
	}

	/*
	@Test//(dataProvider="getData")
	public void searchSupplier_TestS()
	{
		dr.switchTo().frame("_pprIFrame");
		dr.findElement(By.xpath("//*[@id='form1:menuTabs1:0:commandMenuItem1']")).click();
		///dc4.sendKeys(suppliername);
	}
	*/
	
	@DataProvider
	
	public String[][] getData() throws IOException
	{	
	int row=xl.getRowCount("Test");
	int col=xl.getColumnCount("Test");
	String [][]data=new  String[row-1][col];
	
	for(int i =2;i<=row;i++)
	{
	for(int j=1;j<=col;j++)
	{
		data[i-2][j-1]=xl.getCellData("Test", i, j);
	
}

}
	return data;
	
	}
}
