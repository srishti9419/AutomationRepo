package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flightfinder {

	WebDriver dr;
	

	@FindBy(xpath="//input[@value='roundtrip']")
	
WebElement RoundTrip;
	
	@FindBy(xpath="//input[@value='oneway']")
	
	WebElement OneWayTrip;
	
	
@FindBy(xpath="//a[text()='SIGN-OFF']")
	
	WebElement signoff;
	
	
	
	public Flightfinder(WebDriver dr)
	{
		PageFactory.initElements(dr, this);
	}
	
	/*public By OnewaytripType=By.xpath("//input[@value='oneway']");
	public By signOff=By.xpath("//a[text()='SIGN-OFF']");
	
	*/
	public boolean selectOneWay()
	{
		OneWayTrip.click();
		
		//return dr.findElement(OnewaytripType).isSelected();
		
		return OneWayTrip.isSelected();
	}
	public boolean Roundtrip()
	{
		RoundTrip.click();
		RoundTrip.isSelected();
		
		return RoundTrip.isSelected();
	}
	
	
	
	
	public void signoff()
	{
		signoff.click();
	}
}
