package prodmigration;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.Xls_Reader;

public class Test1 {
	

		WebDriver driver;
		Xls_Reader xl;
		@Test(dataProvider="getData")
		public void launchBrowser() throws InterruptedException
		{

			System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
			String downloadFilepath = System.getProperty("user.dir")+"\\"+foldername;
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("download.default_directory", downloadFilepath);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", chromePrefs);

			
			
			
			
			 driver= new ChromeDriver();
				
				 //login xref
				
			 driver.get("https://commerce.spscommerce.com/auth/login/");
			 
			 Thread.sleep(1000);
			
				
				driver.switchTo().frame(0);
				//WebDriverWait wait=new WebDriverWait(driver,30);
				
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("srathore@spscommerce.com");// enter username
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Seetu@1994");//enter password
			
			Thread.sleep(2000);
			

			
			driver.findElement(By.xpath("//span[text()='Sign In']")).click(); // login
			Thread.sleep(1000);
			driver.get("https://commerce.spscommerce.com/xrefs/");
			driver.manage().window().maximize();
//			driver.switchTo().defaultContent();
			
		}
			@Test(dependsOnMethods="getData")
			public void xreflogin( String sheetname,String supplier,String retailer) throws InterruptedException
			{
			Thread.sleep(5000);
			driver.switchTo().frame(0);
			
			
			driver.findElement(By.xpath("/html/body/intapps-app/ia-navbar/div/nav/ng-transclude/ia-env-selector/ia-select/div/div[1]/div[1]")).click();

			
			driver.findElement(By.xpath("/html/body/intapps-app/ia-navbar/div/nav/ng-transclude/ia-env-selector/ia-select/div/div[2]/div[1]/div[2]/span/span")).click();
			
			
			
			

			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("/html/body/intapps-app/div/ui-view/xref-data-search/ui-view/ngf-search-form/form/div/div[1]/ng-transclude/div/div[1]/label")).sendKeys("Walmart USA");
			
			
			
			
			driver.findElement(By.xpath("/html/body/intapps-app/div/ui-view/xref-data-search/ui-view/ngf-search-form/form/div/div[1]/ng-transclude/div/div[3]/label")).sendKeys("Swift Response");
			driver.findElement(By.xpath("//span[text()='Search']")).click();
			
			driver.findElement(By.xpath("//span[text()='Download Search']")).click();
			
			
			
			
			
	}
		
		@DataProvider
		public String[][] getData() throws IOException
		{
			int rows=xl.getRowCount("Login");
			int cols=xl.getColumnCount("Login");
			
			System.out.println(rows);
			System.out.println(cols);
			String[][] data=new String[rows-1][cols];
			
			for(int r=2;r<=rows;r++)
			{
				for(int c=1;c<=cols;c++)
				{
					data[r-2][c-1]=xl.getCellData("Login", r, c);
				}
			}
			return data;
		}

}
