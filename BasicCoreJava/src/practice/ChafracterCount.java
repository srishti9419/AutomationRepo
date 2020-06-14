package practice;

public class ChafracterCount {
	

	
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		String s1= "java is lava";
		/*
		int len=s1.length()-s1.replace("j", " ").length();
		
		System.out.println(len);*/
		
	int count =0;
		
	for(int i=0;i<s1.length();i++)
	{
		if(s1.charAt(i)=='a')
		{

			count++;
	}
		
}
	System.out.println(count);
	
	}
	
}