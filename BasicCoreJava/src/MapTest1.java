import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest1 {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(101, "srishti");
		
		map.put(101, " ");
		
		Set<Integer> key=map.keySet();
		
		for(Integer a:key)
		{
		System.out.println(map.get(a));
		System.out.println("//////////////////////////////////////////////////////////////////////////////////");
		
Map<String,String> map1=new Hashtable<String,String>();// can not contain null key, synchronoiosed,lagacy class
		
		map1.put("name1", "srishti");
		map1.put("name2", "somaya");
		map1.put("name3"," preeti");
		System.out.println(map1.get("name1"));
		
		Set<String> name=map1.keySet();
		
		
		for(String name1: name)
		{
			System.out.println(map1.get(name1));
			
		}
		
		
		
		TreeMap<Integer,String> map3=new TreeMap<Integer,String>();    
	      map3.put(100,"Amit");    
	      map3.put(102,"Ravi");    
	      map3.put(101,"Vijay");    
	      map3.put(103,"Rahul");  
	      
	      System.out.println(map3.getKey);
	
		
	}

		
	}
}

