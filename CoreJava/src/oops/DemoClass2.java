package oops;

 class student {
    static void name() {
        System.out.println("This is student Property");
    }
}
public class DemoClass2 {

	public static void display()
	
	{
		System.out.println("This a user defined method");
	}
	static void goOut()
	{
		System.out.println("This a static method");
	}
	public static void main(String[] args) {
		display();
		
		goOut();
		student.name();
		

	}

}
