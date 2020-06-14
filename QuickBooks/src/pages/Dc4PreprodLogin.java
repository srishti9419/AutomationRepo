package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dc4PreprodLogin {
	
	WebDriver dr;
	
	
	
	
	@FindBy(name="ssousername")
	
	WebElement dc4username;
	
	@FindBy(name="password")
	WebElement dc4password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginDc4;
	
	@FindBy(partialLinkText="Click here to return to the DC4 UI homepage.")
	
	WebElement link;
	
	@FindBy(xpath="//*[@id='form1:panelPage1']/div[1]/div[3]/h1")
	
	
	WebElement img;

		public Dc4PreprodLogin(WebDriver dr)
			{
			
				
				PageFactory.initElements(dr, this);
			}
			
	
	public void login(String username,String password)
	{
		dc4username.sendKeys(username);
		dc4password.sendKeys(password);
		
		loginDc4.click();
		//link.click();
		
		
	}

}
