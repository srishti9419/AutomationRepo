package BasicTestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PersonalChat {
	
	public void beforeClass()
	{
		System.out.println("pre condition for personal chat");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("post condition for personal chat");
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
		System.out.println("Personal chat tes case1");
	}
	
	public void test2()
	{
		System.out.println("Personal chat tes case2");
	}
	
	public void test3()
	{
		System.out.println("Personal chat tes case3");
	}
}
