package inheritance;

class Device
{
	public void turnOn()
	{
		System.out.println("Device is turn on");
	}
}

class Phone extends Device
{
	public void call()
	{
		System.out.println("Phone is making call");
	}
}

class Laptop extends Device
{
	public void compile()
	{
		System.out.println("Laptop is compiling code");
	}
}

public class HirarchialInheritance {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.call();
		p.turnOn();
		
		Laptop lp = new Laptop();
		lp.compile();
		lp.turnOn();

	}

}
