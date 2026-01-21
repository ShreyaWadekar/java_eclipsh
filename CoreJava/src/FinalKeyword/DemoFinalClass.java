package FinalKeyword;

final class MathOperation
{
	static int add(int a, int b)
	{
		return a+b;
	}
	
	static int sub(int a, int b)
	{
		return a-b;
	}
}

public class DemoFinalClass 
{
	
	public static void main(String[] args) {
		MathOperation m= new MathOperation();
		System.out.println(m.add(10, 20));
		System.out.println(m.sub(40, 10));

	}

}
