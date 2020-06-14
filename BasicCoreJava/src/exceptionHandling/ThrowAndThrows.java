package exceptionHandling;

public class ThrowAndThrows {
	
	
	public static void main(String[] args) {
		
		System.out.println("step1");
		pause(-3000);
		
		System.out.println("step2");
		
		
	}

	private static void pause(long milliSeconds) throws Exception {
		// TODO Auto-generated method stub
		
		
		if(milliSeconds>=0)
		{
			Thread.sleep(milliSeconds);
			
		}
		else
		{
			throException("please eenter positive value");
		}
	}

	private static void throException(String message) throws Exception
	
	{
		// TODO Auto-generated method stub
		
		
		throw new Exception(message);
		
		//throw to throw exceptionn internally
		//we use throw keyword to throw exception internally
		//not sure in handling use throws checked with unchecked	
	}
	

}
