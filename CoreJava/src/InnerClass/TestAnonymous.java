package InnerClass;

abstract class Greeting
{
	abstract void satHello();
}

public class TestAnonymous {

	public static void main(String[] args) {
		Greeting g= new Greeting()
		{
			public void satHello()
			{
				System.out.println("Hello from anonymous class");
			}
		};
		g.satHello();

	}

}
