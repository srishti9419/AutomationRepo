package BasicTestNGAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	@BeforeSuite
	public void beforeSuite()
	{
		
		System.out.println("before suite");
	}
	
	@AfterSuite
public void aftersuite()
{
	System.out.println("after suite");
}
}
