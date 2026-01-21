package oops;

class A
{
	int age;
	String name;
	
	public void show()
	{
		System.out.println("Print age : "+age);
		System.out.println("Print name : "+name);
	}
}
public class CallObject {

	public static void main(String[] args) {
		A a1=new A();
		a1.age= 20;
		a1.name= "Shreya";
		a1.show();
	}

}
