package practice;

public class FindUpperLowerCase {
	
	public static void main(String[] args) {
		
	
	
	String s=" srishti RAthore9@gmail.com";
	
	int uppercase=0;
	int lowrcase=0;
	int other=0;
	
	
	
	for(int i=0; i<s.length();i++)
	{
		char ch=s.charAt(i);
		
		
		if(Character.isUpperCase(ch))	{
			uppercase++;
		}
	
		else if(Character.isLowerCase(ch))
		{
			lowrcase++;
		}
		else
		{
			other++;
		}
}
	
	System.out.println(uppercase);
	
	
	}
	
}


