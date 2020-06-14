package BasicTestNGAnnotations;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupChat {
	
	private static final String Throw = null;
	@BeforeTest
	
	public void beforeChatModule()
	{
		System.out.println("contacts shoud be loaded");
	}
	
	
	@AfterTest
	public void afterChatModule()
	{
		System.out.println("after chat module");
		System.out.println("***********************************************************************************************");
	}
	
	@BeforeClass
	
	public void beforeClass()
	{
		System.out.println("create group");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("delete group");
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
	
	@Test
	public void test1()
	{
		System.out.println("group chat tes case1");
		
		throw new SkipException("group chat test case ");
	}
	@Test
	public void test2()
	
	
	{
		
		System.out.println("test case2");
		System.out.println(10/0);
	}
	@Test
	public void test3()
	{
		System.out.println("group chat tes case3");
	}
}

