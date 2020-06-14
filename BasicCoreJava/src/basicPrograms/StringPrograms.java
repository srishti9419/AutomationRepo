package basicPrograms;

public class StringPrograms {
	
	
	
	static String reverseString( String name)
	{
		
		char[]ch=name.toCharArray();
		String reverse=" ";
		System.out.println(ch.length);
		System.out.println(ch.length-1);
		System.out.println(ch[4]);
		for(int i=ch.length-1;i>=0;i--)
		{
			
			reverse=reverse+ch[i];
		}
		
		return reverse;
		
	
	}
	
	
	
	
	public static void main(String[] args) {
		
	System.out.println(reverseString("shubhi"));
	}


}