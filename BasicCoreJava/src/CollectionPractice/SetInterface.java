package CollectionPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SetInterface {
	
	
	
	
	@Test(enabled=false)
	
	public void hashset()
	{
		Set<String> data=new HashSet<String>();
		data.add("Srishti");
		data.add("shubhi");
		
	for(String ar: data)
	{
		System.out.println(ar);
	}
	}
	
	@Test(enabled=false)
	public void LinkedHashset()
	{
		Set<String> data=new LinkedHashSet<String>();
		
		
		data.add("Srishti");
		data.add("shubhi");
		data.add("Srishti");
		data.add(" ");
		data.add("rahul");
		data.add(" ");
		data.add("shu");
		
		for(String ar: data)
		{
			System.out.println(ar);
		}
		
	}
	
	@Test
	public void treeset()
	{
		TreeSet<String> set=new TreeSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Vijay"); 
		set.add("Ravi");  
		set.add("Ajay");  
		
		Iterator<String> itr=set.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
	
	
}
