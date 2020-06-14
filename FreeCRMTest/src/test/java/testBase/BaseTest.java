package testBase;



	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import utilities.TestUtil;

	public class BaseTest {
		
		public static WebDriver dr;
		public static Properties prop;
		
		public BaseTest()

		{
			try{
			prop= new Properties();
			FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"/src/main/java/Configurations/config.properties");
			prop.load(file);
			
		}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
		public void initialization()
		{
			String browsername= prop.getProperty("browser");
			if(browsername.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");	
				dr = new ChromeDriver(); 
			}
			else if(browsername.equals("FF")){
				System.setProperty("webdriver.gecko.driver", "D:/Drivers/geckodriver.exe");	
				dr = new FirefoxDriver(); 
			}
			
			dr.manage().timeouts().implicitlyWait(TestUtil.implicitwait, TimeUnit.SECONDS);
	        dr.manage().deleteAllCookies();
	        dr.get(prop.getProperty("url"));
	        
	     
			
		}
	}

