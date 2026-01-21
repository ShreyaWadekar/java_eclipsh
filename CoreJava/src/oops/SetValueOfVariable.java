package oops;

class Human
{
	//data member
	String name;
	int age;
	
	public void displayInfo() // member function
	{
		System.out.println("Name of Human is "+name);
		System.out.println("Age of Human is "+age);
	}
}
public class SetValueOfVariable {

	public static void main(String[] args) {
		//Creating the object
		Human h = new Human();
		h.name = "John";   //setting data member
		h.age = 21;
		
		h.displayInfo();  //calling member function
		
		System.out.println(h.age);
		System.out.println(h.name);
	}

}
