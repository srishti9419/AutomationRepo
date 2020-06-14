package stringClass;

public class StringClassFunctions {
	
	public static void main(String[] args) {
		
		String name="Nov 15, 2019";
		
		String name2="nov 15, 2019";
		
		
		//length
		System.out.println(name.length());
		
		//2. CharAt
		System.out.println(name.charAt(3));
		
		//3. Subtring
		
		System.out.println(name.substring(8));
		
		System.out.println(name.substring(0,3));
		
		//4. split
		
		
		String arr[]=name.split(" ");
		
		for(String ar:arr)
		{
			System.out.println(ar);
		}
		//5.Equals
		
		System.out.println(name.equals(name2));
		
		//EqualsEgnoreCase
		System.out.println(name.equals(name2));
		
		//trim
		
		System.out.println(name);
		System.out.println(name.trim());
		
		//8. Replace
		System.out.println(name.replace(",", ""));
		
		
		//9.contains
		System.out.println(name.concat("15"));
		
		//10 . UpperCase
		System.out.println(name.toUpperCase());
		
		//11.lowerCase
		System.out.println(name.toLowerCase());
		
		
		
	}
	

}
