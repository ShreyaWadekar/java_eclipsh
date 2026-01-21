package ExceptionHandling;

public class DemoException {

	public static void main(String[] args) {
		try {
			int a =10, b=0;
			
			System.out.println("WelCome to Exception Handling");
			System.out.println("Result of Addition : "+(a+b));

			System.out.println("Result of Division : "+(a/b));
			System.out.println("Result of Substraction : "+(a-b));
		
		}
		catch (Exception e) {

			System.out.println("Can not divided by Zero.");
		}

		System.out.println("Rest of code");
		
	}

}
