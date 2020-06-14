package stringprogram;

public class DuplicateElement {
	public static void main(String[] args) {
		
		  String str="srisht rathore"   ;
		  char arr[]=str.toCharArray();
		      
		        
		
		
		for (int i = 0; i < arr.length; i++) {     
	        for (int j = i+1; j < arr.length; j++) {     
	           if(arr[i] == arr[j] || arr[i]!=' ') 
	           {
	        	   System.out.println(arr[j]);
	           }
	               
	           }    
		
		
	}

}
}
