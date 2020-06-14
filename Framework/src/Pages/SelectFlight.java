package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectFlight {
	
	WebDriver dr;
	
	
	
	
	@FindBy(xpath="//b/following::select[@name='passCount']")
	
public WebElement SelectPssnger;
	
	@FindBy(xpath="//select[@name='fromPort']")
	
public 	WebElement SelectDepartFrom;
	
	@FindBy(xpath="//select[@name='fromMonth']")
public 	WebElement SelectMonth;
	
	@FindBy(xpath="//select[@name='fromDay']")
	
	public WebElement SelectDate;
	
@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")	
public WebElement Businesslass;
@FindBy(css="input[value='Coach']")
public WebElement Economy;
@FindBy(xpath="//input[@value='First']")
public WebElement FirstClass;

@FindBy(xpath="//select[@name='airline']")
WebElement Airline;



	
	
	
	
	public SelectFlight(WebDriver dr)
	{
		PageFactory.initElements(dr, this);
	}
	
	public String selectPassenger(String count)
	{
	
		Select sel=new Select(SelectPssnger);
		
		sel.selectByVisibleText(count);
		
		return count;
		
	}
	
	public String selectDepartFrom(String location)
	
	{
		Select sel=new Select(SelectDepartFrom);
		sel.selectByVisibleText(location);
		
		return location;
	}
	
public boolean selectMonth(String month)
	
	{
		Select sel=new Select(SelectMonth);
		sel.selectByVisibleText(month);
		
		List<WebElement> mnth=sel.getOptions();
		boolean res=false;
		for(WebElement e: mnth)
		{
			if(e.equals(mnth))
			{
				res=true;
			}
			
		}
		
	return res;
		
	}

public String selectDate(String date)

{
	Select sel=new Select(SelectDate);
	sel.selectByVisibleText(date);
	
	return date;
}


public boolean businessClass()
{
	Businesslass.click();
	
	return Businesslass.isSelected();
	
	
	
}
	
public boolean economyClass()
{
	Economy.click();
	
	return Businesslass.isSelected();
	

	

}
public void firstClass()
{
	FirstClass.click();
	
	//return FirstClass.isSelected();
	

	

}

public String airline()
{
	Select sel =new Select(Airline);
	sel.selectByVisibleText(arg0);
}



	

}

