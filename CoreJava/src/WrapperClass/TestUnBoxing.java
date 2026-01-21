package WrapperClass;

public class TestUnBoxing {

	public static void main(String[] args) {
		Double d1 = 50.00;
		
		double d = d1;
		System.out.println("d is : "+d);
		
		Double d2=60.00;
		double d3 = d2.doubleValue();
		System.out.println("d3 is : "+d3);
		
		float f= 12;
		Float f1=f;
		float f2= f1;
		System.out.println("f2 is : "+f2);
		
		Float f4= f1.floatValue();
		System.out.println("f4 is : "+f4);
		
		
		
		}

}
