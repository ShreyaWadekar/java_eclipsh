package packageDefault;

public class PrivateDemo {
	
	private int n = 10;

	private void printDetails()
	{
		System.out.println("private method");
	}
	public static void main(String[] args) {
		PrivateDemo p = new PrivateDemo();
		
		System.out.println(p.n);

		p.printDetails();
	}

}
