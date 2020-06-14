package constructor;

public class Car {

	String model;
	String color;
String type;

public Car() //default constructor
{
	
}
public Car(String model, String color,  String type)
{
	this.model=model;
	this.type=type;
	this.color=color;
	
}
public void specification()
{
	System.out.println("The"+color+" "+model+" is" +type);
}
	
}
