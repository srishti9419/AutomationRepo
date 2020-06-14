package practice;

import java.util.HashMap;

public class DuplicateWithHashMp {
	public static void main(String[] args) {
		
		String s="srishti rathore is my name";
		
		char string[]=s.toCharArray();
		
		HashMap<Character,Integer> characterCount=new HashMap<>();
		
		for(char ch : string)
		{
			if(characterCount.containsKey(ch))
			{
				characterCount.put(ch, characterCount.get(ch)+1);
			}
			
			else
			{
				characterCount.put(ch, 1);
			}
		}
		
		System.out.println(characterCount);
		
	}

}
