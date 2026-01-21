package TestAbstraction;

interface MyInterfaace
{
	default void show()
	{
		System.out.println("Show method");
	}
	
	default void display()
	{
		printDetails();
		System.out.println("Display method");
	}
	
	private void printDetails()
	{
		System.out.println("Private method");
	}
}

class PrivInterface implements MyInterfaace
{
	public void name()
	{
		System.out.println("Child method");
	}
}

public class TestPrivateInterface {

	public static void main(String[] args) {
		PrivInterface p =new  PrivInterface();
		p.display();
		p.show();
		p.name();

	}

}
