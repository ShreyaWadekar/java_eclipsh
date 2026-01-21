package recording;

class A
{
	int id=101;
}

class B
{
	String name="Shreya";
}


class C extends A
{
	String city="Pune";
	
	void display()
	{
		System.out.println("Id : "+id+" City : "+city);
	}
}

class D extends B
{
	String city="Pune";
	
	void display()
	{
		System.out.println("Name : "+name+" City : "+city);
	}
}
public class example1 {

	public static void main(String[] args) {
		C c=new C();
		c.display();

		D d= new D();
		d.display();
	}

}
