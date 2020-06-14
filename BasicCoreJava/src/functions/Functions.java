package functions;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//sum();		
		int a =sum(5,6);
		int b=sum(7,9);
		System.out.println(a+b);
		NonStaticFunctions obj=new NonStaticFunctions();
		obj.sum(6,7);
	}
		
		
		/*public static void sum()
		{
			int a=10;
			int b=20;
			int c=a+b;
			System.out.println(c);

		}
*/
	
	
	
	
	/*public static void sum(int a , int b)
	{ 
		
		int sum=a+b;
		System.out.println(sum);
	}


*/
	public static int sum(int a, int b)
	{
	
	int sum=a+b;
	
	return sum;
	}
}