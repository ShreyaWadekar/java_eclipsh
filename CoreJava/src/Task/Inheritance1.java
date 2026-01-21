package Task;

class vehical
{
	void run()
	{
		System.out.println("vehical is runing");
	}
}

class car extends vehical
{
	void start()
	{
		System.out.println("car is starting");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		car c= new car();
		c.run();
		c.start();

	}

}
