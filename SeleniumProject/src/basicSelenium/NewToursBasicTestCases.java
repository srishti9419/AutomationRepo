package basicSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class NewToursBasicTestCases {
	WebDriver dr;
	String  username="srishtisdgdfsd";
	String  password="srishtisdfsdf";
	
	
	@BeforeClass
	
	public void launchApplication()
	{
System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		
		 dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		
	}
	
	
	@AfterClass
	public void closeApplication()
	{
		dr.quit();
	}
	
	
	@Test(dependsOnMethods={"registration"})
	
	public void login()
	{
		dr.get("http://newtours.demoaut.com/");
		
		WebElement username =dr.findElement(By.name("userName")); //webElement id interface
		
		username.sendKeys(this.username);
		WebElement password=dr.findElement(By.name("password"));
		password.sendKeys(this.password);
		
		WebElement signIn=dr.findElement(By.name("login"));
	signIn.click();
		
	}
	@Test(dependsOnMethods={"selectPassangers"})
	public void logout()
	{
		
		dr.findElement(By.xpath("//a[text()='SIGN-OFF']")).click();
	}

	
	@Test
	public void registration()
	{
		
		dr.get("http://newtours.demoaut.com/");
		
		dr.findElement(By.linkText("REGISTER")).click();
		dr.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		dr.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(password);
		dr.findElement(By.name("register")).click();
		
		By message=By.xpath("//b[contains(text(),'"+username+"')]");
		boolean res=isElementPresent(message);
		
		Assert.assertEquals(true, res);
		
	
}
	
	@Test(dependsOnMethods={"logout"})
	public void support()
	{
		dr.findElement(By.linkText("SUPPORT")).click();
	}
	
@Test(dependsOnMethods={"login","registration"})
	public void selectOneWay()
	{
	WebElement oneway=  dr.findElement(By.xpath("//input[@value='oneway']")); //radio button
	oneway.click();
	System.out.println(oneway.isSelected());
	
		
	}
@Test(dependsOnMethods={"selectOneWay"}) //(dependsOnMethods={"login","selectOneWay"}
	public void selectPassangers()
	{
WebElement pass=dr.findElement(By.xpath("//select[@name='passCount']"));
	
	Select sel= new Select(pass);
	
	sel.selectByIndex(2);
	
	}

/*public boolean isElementPresent(String xpath)
{
int size=	dr.findElements(By.xpath(xpath)).size();*/


public boolean isElementPresent(By element)
{
int size=	dr.findElements(element).size();
if(size>0){
	return true;
}
else
{
	return false;
}
}

@Test
public void businessClass()
{
	dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();;
}
	

	
	
}
	
