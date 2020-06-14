package basicPrograms;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.log4j.chainsaw.Main;

public class BubbleSort {
	

	public static void  bubblesort(int arr[])
	{
		
		int temp= 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			
		}
		
	}
	
	}
		public static void main(String[] args)
		{  
	
	

		
		int arr[] ={3,60,35,2,45,320,5};  
		bubblesort(arr);
		
		
		 for(int i=0; i < arr.length; i++){  
             System.out.print(arr[i] + " ");
		
		
		
		
		
	
	}
		
		
		
		
		
		
		
		
	
		
		
	}
	
	 
	
	

}
