package basicPrograms;

public class SelectionSort {
	
	public static  void selectionsort( int arr[])
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			int index=i;
	
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[index])
				{
					
					index=j;
					
					
				}
			}
			
			int smallNumber= arr[index];
			arr[index]=arr[i];
			arr[i]=smallNumber;
			
		}
	}
	
	public static void main(String[] args)
	{  



	
	int arr[] ={3,60,35,2,45,320,5};  
	selectionsort(arr);
	
	
	 for(int i=0; i < arr.length; i++){  
         System.out.print(arr[i] + " ");
	
	
	
	
	

}
	

}
}
