package recording;

class AreaCalulation
{
	void area(double radius)
	{
		double result= 3.14*radius*radius;
		System.out.println("Calculate area of circle : "+result);
	}
	
	void area(int side)
	{
		int result= side*side;
		System.out.println("Calculate area of square : "+result);
	}
	
	void area(int length, int breadth)
	{
		int result= length*breadth;
		System.out.println("Calculate area of Ractangle : "+result);
	}
}

public class AreaCalculator {

	public static void main(String[] args) {
		AreaCalulation a= new AreaCalulation();
		a.area(5.0);
		a.area(12);
		a.area(6, 8);

	}

}
