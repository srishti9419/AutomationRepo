package CollectionPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;
import org.testng.annotations.Test;

public class MapInterface {
	
	
	@Test
	public void maptest()
	{
		Map<Integer,String> map=new HashMap<Integer,String>();
map.put(1, "radhe");
map.put(2, "krishna");
map.put(3, "shayam");

Set<Integer> keys=map.keySet();

for(Integer i: keys)
{
	System.out.println(map.get(i)+i);
	
}


		
		
	}
	

}
