package oops;

class Calculator
{
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int add(int a, int b,int c)
	{
		return a+b+c;
	}
	
	public float add(float a, float b)
	{
		return a+b;
	}
	
	public double add(double a, double b)
	{
		return a+b;
	}
	
}

public class MethodOverLoading {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		int res=c.add(12, 20);
		int res1=c.add(33, 56, 46);
		float res2=c.add(23.5f, 78.9f);
		double res3=c.add(45.676767, 560.898989);
		
		System.out.println("1st method : "+res);
		System.out.println("2nd method : "+res1);
		System.out.println("3rd method : "+res2);
		System.out.println("4th method : "+res3);

	}

}
