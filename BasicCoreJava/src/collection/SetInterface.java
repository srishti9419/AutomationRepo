package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SetInterface {

	@Test
	public void test1()
	{
		Set<Integer> set=new HashSet<>();  // does not allow duplicate entry
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		
		for(int a:set)
		{
			System.out.println(a);
		}
		System.out.println("**********************************************************");//prints in random order
	
	}
	
	@Test 
	public void test2()
	{
		Set<Integer> set=new LinkedHashSet<>();  // does not allow duplicate entry
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		
		for(int a:set)
		{
			System.out.println(a);
		}
		System.out.println("**********************************************************");// preseve the order
	
	}
	
	@Test(priority=1)
	public void test3()
	{
		Set<Integer> set=new TreeSet<>();  // does not allow duplicate entry
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		
		for(int a:set)
		{
			System.out.println(a);
		}
		System.out.println("**********************************************************");// sort the data
	
	}
}
