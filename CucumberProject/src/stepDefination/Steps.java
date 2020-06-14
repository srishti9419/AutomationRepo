package stepDefination;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver dr;
	

@Given("^Application is up and running$")
public void application_is_up_and_running()  {
	System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
	
	
	 dr=new ChromeDriver();
	dr.manage().window().maximize();
	
	dr.get("http://newtours.demoaut.com/");
   
	System.out.println("Application is upo and running  ");
   
}

@When("^I enter valid credential and click login$")
public void i_enter_valid_credential_and_click_login()  {
	System.out.println("enter valid credentials");
  
}

@Then("^I should see the  homepage$")
public void i_should_see_homepage() {
    
	System.out.println(dr.getTitle());
    

}
@And("^Click on login button$")
public void click_on_login_button()  {
	System.out.println("click on login button");
	
	WebElement signIn=dr.findElement(By.name("login"));
	signIn.click();
    
}

/*@When("^When I enter (.*?) and (.*?)$")
public void when_I_enter_mercury_and_mercury(String user, String pass) {
	
	WebElement username =dr.findElement(By.name("userName")); //webElement id interface
	
	username.sendKeys(user);
	
	
	WebElement password=dr.findElement(By.name("password"));
	password.sendKeys(pass);
	
}
*/


}
