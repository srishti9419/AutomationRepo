package basicPrograms;

public class ABC {
	
	static int n1=0;
	static int n2=1;
	static int n3;
	 void fabonacciseries(int count )
	{

		 if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         fabonacciseries(count-1);    
	     }    
	 }
	 
	 int factorial(int number )
		{
		 
		 int fact=1;
		 for(int i=1;i<=number;i++)
		 {
			 fact=fact*i;
		 }

		 return fact;
		}
	 
	 
	void primenumber( int number)
	 {
		 int m=0; 
		 int flag=0;
		 int i=0;
		 
		 m=number/2;
		 if(number==0 || number==1)
		 {
			 System.out.println("not a prime number");
		 }
		 else
		 {
		 for(i=2;i<=m;i++)
		 {
			 if(number%i==0)
			 {
				 System.out.println("not prime number");
			 }
			 flag=1;
			 
			 break;
			 
		 }
		 }
		 if(flag==0)
		 {
			 System.out.println(number+"prime nuber");
		 }
			 
	 }
	
	public static void main(String[] args) {
		int count=6;
	
		ABC ab=new ABC();
		System.out.print(n1+" "+n2);
		ab.fabonacciseries(count-2);
		
		System.out.println();
		
		System.out.println(ab.factorial(4));
		ab.primenumber(7);


	}
	

}
