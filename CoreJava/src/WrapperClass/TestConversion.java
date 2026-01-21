package WrapperClass;

public class TestConversion {

	public static void main(String[] args) {
		String n ="123";
		
		int a = Integer.parseInt(n);
		System.out.println(a);
		
		int a1 =10;
		String s = Integer.toString(a1);
		System.out.println(s);
		
		double d = Double.parseDouble(n);
		System.out.println(d);
	}

}
