package practice;

public class DuplicateValue {
	
	public static void main(String[] args) {
		
	
	
	String s=" my name is srishti";
	
	char ch[]=s.toCharArray();
	
	int count=0;
	
	for(int i=1;i<ch.length;i++)
	{
		count=1;
	  for(int j=i+1;j<ch.length;j++)
	  {
		  if(ch[i]==ch[j] && ch[i]!=' ')
			  
		  {	  
			  count++;
		  
		  ch[j]='0';
		  }	  
	  } 
		if( ch[i]!=' '&& ch[i]!='0')
			
			System.out.println(ch[i]+"_"+count);

}
	

}
}