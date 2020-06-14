package collection;

import java.util.List; 
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

import org.testng.annotations.Test;

public class ListInterface {
	
	@Test(enabled=false)// disable 
	
	public void test()
	
	{
		
		List list= new ArrayList<>();// refernce of object class, by default object class reference
		
		list.add("Srishti");
		list.add(10);
		
		list.add(true);
		list.add(new ListInterface());
	}
		
		
		@Test
		
		public void test2()
		{
			
			List<String> list=new ArrayList<>();
			list.add("Anand");
			list.add("10");
			list.add("techbodhi");
			
			
			for(String s:list)
			{
				System.out.println(s);
			}
			
		}
		
		@Test
		
		public void test3()
		{
			
			List<String> list=new LinkedList<>();
			list.add("srishti");
			list.add("10");
			list.add("techbodhi");
			list.add("techbodhi");
			
			
			for(String s:list)
			{
				System.out.println(s);
			}
			
	
}
		@Test
		public void test4()
		{
			
			List<String> list=new Vector<>();
			list.add("Anand");
			list.add("10");
			list.add("techbodhi");
			list.add("Anand");
			
			
			for(String s:list)
			{
				System.out.println(s);
			}
		}
}