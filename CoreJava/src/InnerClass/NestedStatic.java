package InnerClass;

class PrintClass
{
	static String msg = "Hello from Nested Static.";
	
	static void show()
	{
		System.out.println("Hello");
	}
	
	static class TestNestedStatic
	{
		public void showMsg()
		{
			System.out.println("Message : "+msg);
		}
	}
}

public class NestedStatic {

	public static void main(String[] args) {
		PrintClass.show();
		PrintClass.TestNestedStatic ot=new PrintClass.TestNestedStatic();
		ot.showMsg();

	}

}
