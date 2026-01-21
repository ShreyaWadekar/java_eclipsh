package SuperKeywords;

class parant
{
	int x=10;
	
}

class Child extends parant
{
	int y =20;
	public void display()
	{
		System.out.println("Y : "+y);
		System.out.println("X : "+super.x);
		System.out.println(x);
	}
}
public class CallInstanceVariable {

	public static void main(String[] args) {
		Child c = new Child();
		c.display();

	}

}
