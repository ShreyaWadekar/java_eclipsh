package TestAbstraction;

interface Shape
{
	public void draw();
	public void display();
	
	default void run()
	{
		System.out.println("Default method");
	}
}

class Circle implements Shape
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
	
	public void display()
	{
		System.out.println("Show Circle");
	}
	
	public void square()
	{
		System.out.println("Drawing square");
	}
}

public class TestInterfaceAbstract {

	public static void main(String[] args) {
		Shape s= new Circle();
		s.draw();
		s.display();
		
		Circle c= new Circle();
		c.square();

	}

}
