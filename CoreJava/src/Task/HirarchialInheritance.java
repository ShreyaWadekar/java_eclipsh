package Task;

class vahicall
{
	void Brand()
	{
		System.out.println("vahical is Brand");
	}
}

class car1 extends vahicall
{
	void Run()
	{
		System.out.println("Car is  on running");
	}
}

class Bike extends vahicall
{
	void kick()
	{
		System.out.println("Bike is start with a kick");
	}
}
public class HirarchialInheritance {

	public static void main(String[] args) {
		car1 c =new car1();
		c.Run();
		c.Brand();
		
		Bike b= new Bike();
		b.kick();
		b.Brand();
	}

}
