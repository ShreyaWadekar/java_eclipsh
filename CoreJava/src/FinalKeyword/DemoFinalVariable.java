package FinalKeyword;

public class DemoFinalVariable {

	final int no = 100;
	public void display()
	{
		//no=200;
		System.out.println(no);
	}
	
	public static void main(String[] args) {
		 DemoFinalVariable d = new DemoFinalVariable();
		 d.display();

	}

}
