package practice;

public class StringPalindrome {
	public static void main(String[] args) {
		
	
	
	String s= "mama";
	
	
	for(int i=0;i<s.length();i++)
	{
		char s1=s.charAt(i);
		
		for(int j=s.length();j>i;j++)
		{
			if(s1==s.charAt(j))
			{
				System.out.println("string is palindrom");
			}
		}
	}
	

}
}