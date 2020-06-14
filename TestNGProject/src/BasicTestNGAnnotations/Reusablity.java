package BasicTestNGAnnotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusablity {
	
	
	
	public  static void click(WebDriver driver ,WebElement locator,int time )
	{
		new WebDriverWait(driver,time).until(ExpectedConditions.elementToBeClickable(locator));
		
		locator.click();
		
	
		
	}

	
	
}
