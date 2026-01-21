package InnerClass;

class  A
{
	interface Showable
	{
		public void show();
	}
}

public class NestedInterface implements A.Showable {
	public void show()
	{
		System.out.println("Nested interface");
	}

	public static void main(String[] args) {
		A.Showable s = new NestedInterface();
		s.show();

	}

}
