package exceptionHandling;

public class TryAndCatch {
	
	//int c=100/0;
	
	
	public void print()
	{
		try{
			int c=100/0;
System.out.println(c);

		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	
	}
	public static void main(String[] args) {
		TryAndCatch Tc=new TryAndCatch();
		Tc.print();
		
		System.out.println("srishti");
		
	}
	
	
}
	
