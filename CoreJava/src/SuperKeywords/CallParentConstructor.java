package SuperKeywords;

class Vehicle
{
	public Vehicle()
	{
		System.out.println("Vehicle is a brand");
	}
}
class Car extends Vehicle
{
	public Car()
	{
		super();
		System.out.println("This Car name is Vehicle");
	}
}

public class CallParentConstructor {

	public static void main(String[] args) {
		Car c=new Car();
		
	}

}
