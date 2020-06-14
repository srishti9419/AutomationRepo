package functions;

public class Car {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	//}

		
	String colour;
	static int wheels;
	String model;
	String brand;
	
	
	public void powerSteering()
	{
		System.out.println("all "+wheels+" wheels support power steering");
	}
	
	
	public void lookAndFeel()
	{
		System.out.println(brand+" has "+colour+" colour in sedan cars");
	}

}
