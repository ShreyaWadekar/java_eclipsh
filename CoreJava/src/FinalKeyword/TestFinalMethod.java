package FinalKeyword;

class FinalTest
{
	final void display()
	{
		System.out.println("Final method");
	}
}

public class TestFinalMethod {

	public void display()
	{
		System.out.println("Child class final method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalTest f= new FinalTest();
		f.display();
	}

}
