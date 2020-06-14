package CollectionPractice;

import org.testng.annotations.Test;

public class ExceptionHandling {
	
	@Test
	public void test()
	{
	
		
		
		try{
			
			int b =39/0;  
			System.out.println("gping to divide");
		}
			catch(ArithmeticException e){
				System.out.println(e);
			}
			
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	
			
		}
	
		}
}
	


