package InnerClass;

class Local
{
	private int a=100;
	public void test()
	{
		System.out.println("Test method of Local class : "+a);
		
		class Localinner
		{
			private String name="Divyani";
			public void print()
			{
				System.out.println("print method inside the Local inner class : "+name+" " +a);
			}
		}
		Localinner li = new Localinner();
		li.print();
	}
}

public class TestLocalClass {

	public static void main(String[] args) {
		Local l=new Local();
		l.test();
		

	}

}
