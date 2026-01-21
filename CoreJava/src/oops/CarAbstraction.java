package oops;

abstract class Car
{
	abstract void start();
}

class Honda extends Car
{
	void start()
	{
		System.out.println("Honda starts with key");
	}
}

public class CarAbstraction {
	public static void main(String[] args) {
		Car c = new Honda();
		c.start();
	}
}

