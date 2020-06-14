package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage {
	WebDriver dr;

	
	
	@Given("^Application running$")
	public void application_is_up_and_running()  {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		
		 dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		dr.get("http://newtours.demoaut.com/");
		/*WebElement username =dr.findElement(By.name("userName")); //webElement id interface
		
		username.sendKeys(user);
		
		
		WebElement password=dr.findElement(By.name("password"));
		password.sendKeys(pass);
		*/
	}
	   
/*	
	@When("^trip type is selected$")
	public void trip_type_is_selected() {
		
		
		
	   
	

}*/
	
	@When("^select depart  date$")
	public void select_depart_date() {
	    
	    
	}

	@When("^select arrive date$")
	public void select_arrive_date()  {
	    
	}

	@Then("^Cick on continue$")
	public void cick_on_continue()  {

	}
}
