package basicSelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindows {
	
	@Test
	
	public void test1()
	{
System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		dr.get("https://www.naukri.com/");
		
		String parent=         dr.getWindowHandle();
		System.out.println(parent);
	Set<String>	wins=dr.getWindowHandles();
	
	
	for(String w:wins)
	{
		
		
		if(!w.equals(parent))
		{
			
			dr.switchTo().window(w);
			dr.close();
		}
	}
	
	
	
	dr.switchTo().window(parent);
	
	}
	

}
