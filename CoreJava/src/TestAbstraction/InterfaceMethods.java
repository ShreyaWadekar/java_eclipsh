package TestAbstraction;

interface MyInterface
{
	static void testStatic()
	{
		System.out.println("Static method called");
	}
	
	private void testPrivate()
	{
		System.out.println("Private method called");
	}
	
	default void testDefault()
	{
		testPrivate();
		System.out.println("Default method called");
	}
	
	public void display();
}

class MyClass implements MyInterface
{
	public void display()
	{
		System.out.println("Display method called");
	}

}

public class InterfaceMethods {

	public static void main(String[] args) {
		MyInterface.testStatic();
		MyInterface m= new MyClass();
		m.testDefault();
		m.display();

	}

}
