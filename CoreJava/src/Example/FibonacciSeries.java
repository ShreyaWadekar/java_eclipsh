package Example;

public class FibonacciSeries {

	public static void main(String[] args)
	{
		int no=10;
		int a=0;
		int b=1;
		
		System.out.println(a+ " " + b+ " ");
		
		for(int i=3;i<=no;i++)
		{
			int c=a+b;
			System.out.println(c+ " ");
			a=b;
			b=c;
		}
		

	}

}
