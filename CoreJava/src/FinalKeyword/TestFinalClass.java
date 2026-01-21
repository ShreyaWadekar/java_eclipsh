package FinalKeyword;

final class A
{
	public void print()
	{
		System.out.println(" parant final class called");
	}
}

public class TestFinalClass {
	
	public void print1()
	{
		System.out.println("Child final class called");
	}

	public static void main(String[] args) {
		TestFinalClass t=new TestFinalClass ();
		t.print1();
	}

}
