package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class MapInterface {
	
	
	@Test(enabled=false)
	public void test1()
	{
		
		Map<String,String> map=new HashMap<String,String>();// contains null key ,non sychronised ,new class
		
		map.put("name1", "srishti");
		map.put("name2", "somaya");
		map.put(null," preeti");
		System.out.println(map.get("name1"));
		
		Set<String> Keys =map.keySet();
		
		
		for(String name: Keys)
		{
			System.out.println(map.get(name));
		}
	}
	
	
	
	@Test
	public void test2()
	{
		
		Map<String,String> map=new Hashtable<String,String>();// can not contain null key, synchronoiosed,lagacy class
		
		map.put("name1", "srishti");
		map.put("name2", "somaya");
		map.put(null," preeti");
		System.out.println(map.get("name1"));
		
		Set<String> Keys =map.keySet();
		
		
		for(String name: Keys)
		{
			System.out.println(map.get(name));
		}
	}
	

}
