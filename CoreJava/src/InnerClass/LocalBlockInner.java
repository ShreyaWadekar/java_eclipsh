package InnerClass;

class Block
{
	int a=100;
	{
		System.out.println("Block : "+a);
		
		class Inner
		{
			private String name="Shreya";
			public void print()
			{
				System.out.println("Print method : "+name);
			}
		}
		Inner i = new Inner();
		i.print();
	}
}

public class LocalBlockInner {

	public static void main(String[] args) {
		Block b= new Block();
	}

}
