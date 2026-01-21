package TestAbstraction;

abstract class Vahicle
{
	abstract void run();
	abstract void show();
	
	public void display()
	{
		System.out.println("Non-abstract method");
	}
}

class Car extends Vahicle
{
	public void run()
	{
		System.out.println("Bike is running");
	}
	
	public void show()
	{
		System.out.println("Bike is Showing");
	}
	
}

public class TestAbstract {

	public static void main(String[] args) {
		Vahicle v= new Car();
		v.run();
		v.show();
		v.display();

	}

}
