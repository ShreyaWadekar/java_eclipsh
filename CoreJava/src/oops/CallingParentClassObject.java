package oops;

class Animal
{
	String name="Generic Animal";
	
}

class Dog extends Animal
{
	String name = "Marfi";
	public void printName()
	{
		System.out.println("Child name: "+name);
		System.out.println("parent name : "+super.name);
	}
}

public class CallingParentClassObject {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.printName();

	}

}
