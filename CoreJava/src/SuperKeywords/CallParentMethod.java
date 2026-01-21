package SuperKeywords;

class Animal
{
	public void show()
	{
		System.out.println("There is one animal..");
	}
}

class Tiger extends Animal
{
	public void eat()
	{
		super.show();
		System.out.println("Tiger is eating something..");
	}
}

class Cat extends Animal
{
	public void run()
	{
		super.show();
		System.out.println("Cat is Runing somewhere..");
	}
}

public class CallParentMethod {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.eat();
		Cat c=new Cat();
		c.run();
	}

}
