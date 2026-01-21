package oops;

class person
{
	public void walk()
	{
		System.out.println("Person is walking");
	}
}
class person1
{
	public void eat()
	{
		System.out.println("Person is Eating");
	}
}
public class DemoClass {

	public static void main(String[] args) {
		person p1 = new person();
		p1.walk();

		person p2 = new person();
		person p3 = new person();
		person p4 = new person();
		person p5 = new person();
		
		p2.walk();
		p3.walk();
		p4.walk();
		p5.walk();
		
		person1 p = new person1();
		p.eat();
	}

}
