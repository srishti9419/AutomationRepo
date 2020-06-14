package arrays;

public class GreatestNumber {
	
	
	public static void main(String[] args) {
	
		int num=0;
	
	int srishti[]={6,4,5,2,9};
	
	
	for(int i=1;i<=srishti.length;i++)
	{
		
		for(int j=i+1;j<=srishti.length-1;j++)
		{
		if(srishti[i]>srishti[j])
		{
			num=srishti[i];
			
			
			
		}
		
	}
		
		System.out.print(num);
		
	}

	
		
	}

	
	
}
