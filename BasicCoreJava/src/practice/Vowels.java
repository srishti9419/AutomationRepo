package practice;

public class Vowels {

	
	public static void main(String[] args) {
		String input = "How many vowels in  String";
				char[] letters = input.toCharArray();
				int count = 0;
				for(char i: letters)
				{
					
					switch(i)
					{
			
				  case 'a':
				  case 'e':
				  case 'i':
				  case 'o':
				  case 'u':
				   	count++;
				break;
				  default: // no count increment 
				 }
					}
					
					
				
				System.out.println("Number of vowels in String [" + input + "] is : " + count);

		
	}
}
