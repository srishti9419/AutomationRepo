package exceptionHandling;

import oops.Abstraction.ICICI;

public class MultlipleCatchBlock {
	
static ICICI  bank;//need to import it

public static void main(String[] args) {
	try{
		System.out.println(10/1);
		
		String[] arr=new String[2];
		arr[0]="Srishti";
			arr[1]="rathore";
			bank.creditcard();
		
		
	}
	catch(ArithmecticException e)
	{
		System.out.println(e.getMessage());
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e.getMessage());
	}
	catch (Exception e) {
		// TODO: handle exception
System.out.println(e.getMessage());
	}
	
	finally{
		System.out.println("tet case completed");
		System.out.println("data connection closed");
		System.out.println("report ending");
		System.out.println("object flush");
	}
}
}
