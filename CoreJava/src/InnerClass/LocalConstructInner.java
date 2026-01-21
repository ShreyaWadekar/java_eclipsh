package InnerClass;

class Demo
{
	int a=100;
	public Demo()
	{
		System.out.println("Local method : "+a);
		
		class Inner
		{
			String name="Shreya";
			public void print()
			{
				System.out.println("Print method : "+name);
			}
		}
		Inner i=new Inner();
		i.print();
	}
}

public class LocalConstructInner {

	public static void main(String[] args) {
		Demo l=new Demo();
	}

}
