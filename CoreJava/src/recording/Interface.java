package recording;

interface A1
{
	int id=101;
}

interface B1
{
	String name="Shreya";
}

interface C1
{
	String color="White";
}

class D1 implements A1,B1,C1
{
	String city="Surat";
	
	void display()
	{
		System.out.println("Id : "+id+" Name : "+name+" Color : "+color+" city : "+city);
	}
}

public class Interface {

	public static void main(String[] args) {
		D1 d= new D1();
		d.display();
	}

}
