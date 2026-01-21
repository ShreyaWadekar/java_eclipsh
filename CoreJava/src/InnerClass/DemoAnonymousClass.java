package InnerClass;

class Animal
{
	public void sound()
	{
		System.out.println("Animal makes sound");
	}
}

public class DemoAnonymousClass {

	public static void main(String[] args) {
		Animal a=new Animal()
		{
			public void sound()
			{
				System.out.println("Dog Barks");
			}
		};
		
		a.sound();

	}

}
