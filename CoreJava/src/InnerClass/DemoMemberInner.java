package InnerClass;

class Action
{
	String name="Shreya";
	
	public void display()
	{
		System.out.println("Name is : "+name);
	}
	
	class Replay
	{
		String name2="Replay";
		public void print()
		{
			System.out.println("Name is inner class : "+name2 );
		}
	}
}

public class DemoMemberInner {

	public static void main(String[] args) {
		Action a= new Action();
		a.display();
		Action.Replay r= a.new Replay();
		r.print();

	}

}
