package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
		
		WebDriver dr;
		
		@FindBy(name="userName")
		public WebElement userName;
		@FindBy(name="password")
		public WebElement passWord;
		@FindBy(name="login")
		public WebElement login;
		
		public HomePage(WebDriver dr)
		{
		PageFactory.initElements(dr, this);
		}
		
		
		
		
		public String login(String username,String password)
		{
			userName.sendKeys(username);
			passWord.sendKeys(password);
			login.click();
			return dr.getTitle();
			
		}
		
		

	


}
