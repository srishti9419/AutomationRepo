package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchSupplier {
	
	WebDriver dr;
	
@FindBy(xpath="//form[@id='form1']/span[@id='form1:panelPage1']/descendant::a[contains(text(),'DC4')][@name='form1:menuTableem1']")
WebElement dc4search;




	
	public SearchSupplier(WebDriver dr)
	{
		
		PageFactory.initElements(dr, this);
		
	}
	
	
	public void SupplierName(String suppiername)
	{
		dc4search.click();
		
	}
	
	
	
	
	
	

}
