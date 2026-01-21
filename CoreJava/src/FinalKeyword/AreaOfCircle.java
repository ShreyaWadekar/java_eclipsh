package FinalKeyword;

final class Area
{
	public static final double PI=3.14;
}

class Circle
{
	public void CalculateArea(double r)
	{
		 double area= Area.PI*r*r;
		 System.out.println("Area of Circle : "+area);
	}
}

public class AreaOfCircle {

	public static void main(String[] args) {
		Circle c= new Circle();
		c.CalculateArea(7);

	}

}
