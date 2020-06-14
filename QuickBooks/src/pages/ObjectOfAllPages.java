package pages;

import org.openqa.selenium.WebDriver;

public class ObjectOfAllPages {
	
	public  Dc4PreprodLogin prepodlogin;
	WebDriver dr;
	
	public ObjectOfAllPages(WebDriver dr) {
		prepodlogin=new Dc4PreprodLogin(dr);
		
		
	}
		

}
