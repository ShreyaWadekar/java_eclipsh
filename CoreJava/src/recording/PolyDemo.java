package recording;

class Polymorphisum
{
	void display()
	{
		System.out.println("display methods get Executed");
	}
	
	void display(int a)
	{
		System.out.println("display methods get Executed : "+a);
	}
	
	void display(String n)
	{
		System.out.println("display methods get Executed : "+n);
	}
}

public class PolyDemo {

	public static void main(String[] args) {
		Polymorphisum p=new Polymorphisum();
		p.display();
		p.display(10);
		p.display("Shreya");

	}

}
