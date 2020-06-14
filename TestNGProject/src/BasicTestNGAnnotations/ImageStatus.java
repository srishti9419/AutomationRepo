package BasicTestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class ImageStatus {
	
	
	

	@BeforeTest
	
	public void beforeStatusModule()
	{
		System.out.println("gallary should be accessible");
	}
	
	
	@AfterTest
	public void afterStatusModule()
	{
		System.out.println("after status module");
	}
	
	@BeforeClass
	
	public void beforeClass()
	{
		System.out.println("pre condition for imagestatus");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("post condition for imagestatus");
	}
	
	
	@BeforeMethod
	
	public void preConditionForTestCase()
	{
		System.out.println("keypad should be enaable");
	}
	
	@AfterMethod
	
	public void postConditionForTestCase()
	{
		System.out.println("Keypad should be disabled ");
	}
	
	public void test1()
	{
		System.out.println("Image status tes case1");
	}
	
	public void test2()
	{
		System.out.println("Image status tes case2");
	}
	
	public void test3()
	{
		System.out.println("Image status tes case3");
	}

}
