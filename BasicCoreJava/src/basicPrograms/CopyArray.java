package basicPrograms;


public class CopyArray {

	
	
	/*public static  void copyrray(int arr[],int arr1[])
	{
	for(int i=1;i<=arr.length;i++)
	{
		
		arr1[i]=arr[i];
	}
	
	
	
}
*/
	
	public static void main(String[] args) {
		int arr1[] =new int[] {3,60,35,2,45};
		int arr2[]=new int[arr1.length];
		
		//copyrray( arr,arr1);
		 for (int i = 0; i < arr1.length; i++) {     
	            arr2[i] = arr1[i];     
	        } 
		
		 System.out.println();    
         
	        //Displaying elements of array arr2     
	        System.out.println("Elements of new array: ");    
	        for (int i = 0; i < arr2.length; i++) {     
	           System.out.print(arr2[i] + " ");    
	        } 
		
		
	}
		
	}