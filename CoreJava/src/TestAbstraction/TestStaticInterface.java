package TestAbstraction;

interface Drawable
{
	public void Draw();
	
	static int Cube(int x)
	{
		return x*x*x;
	}
	
	static void cube(int a)
	{
		int res = a*a*a;
		System.out.println("cube : "+res);
	}
	
	default void show()
	{
		System.out.println("Default method");
	}
}

class Ractangle implements Drawable
{
	public void Draw()
	{
		System.out.println("Drawing rectangle");
	}
}

public class TestStaticInterface {

	public static void main(String[] args) {
		Drawable d=new Ractangle();
		d.Draw();
		d.show();
		System.out.println("Cube : "+Drawable.Cube(5));
		Drawable.cube(5);
	}

}
