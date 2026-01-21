package oops;

class calc
{
	int add(int a, int b)
	{
		return a+b;
	}
	double add(double a,double b)
	{
		return a-b;
	}
}

public class calcPolymorphism {

	public static void main(String[] args) {
		calc c= new calc();
		
		System.out.println("Addition : "+c.add(23, 43));
		System.out.println("Addition : "+c.add(20.0, 23.3));

	}

}
