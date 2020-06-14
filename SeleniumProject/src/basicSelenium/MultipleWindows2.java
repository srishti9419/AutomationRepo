package basicSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindows2 {
	
@Test
public void tes1()
{
	System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
	
	
	ChromeDriver dr=new ChromeDriver();
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	dr.get("https://www.naukri.com/");
	
	String parent=         dr.getWindowHandle();
	
Set<String>	wins=dr.getWindowHandles();


for(String w:wins)
{
	dr.switchTo().window(w);
	
	if(dr.getTitle().equals("Tech Mahindra"))
		dr.close();
			
	
}



dr.switchTo().window(parent);


}

}
