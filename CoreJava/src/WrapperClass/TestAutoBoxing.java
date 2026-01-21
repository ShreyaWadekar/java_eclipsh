package WrapperClass;

public class TestAutoBoxing {

	public static void main(String[] args) {
		int a=10;
		Integer b =a;
		System.out.println("b is : "+b);
		
		int x=20;
		Integer y = Integer.valueOf(x);
		System.out.println("y is : "+y);

	}

}
