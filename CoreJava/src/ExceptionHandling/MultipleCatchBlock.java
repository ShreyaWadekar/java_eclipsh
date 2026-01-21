package ExceptionHandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
	System.out.println("Welcome to exception");
	try {
		int a[]= new int[4];
		a[3]=20/10;
		
		String n=null;
		System.out.println(n.length());
		
	} 
	catch (ArithmeticException e) {
		System.out.println("zero not divisible to any number");
		System.out.println(e);
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("String not found");
		System.out.println(e);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	System.out.println("rest of code");
	}

}
