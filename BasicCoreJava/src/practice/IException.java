package practice;

import java.io.IOException;

public class IException {
	
	

	static int a[]=new int[4];
	void m(){  
	    throw new ArithmeticException();//checked exception  
	  }  
	  void n() {  
	    m();  
	  }  
	


	public static void main(String[] args)  {
		IException cc=new IException();
		cc.n();
		  

		
	}

}

