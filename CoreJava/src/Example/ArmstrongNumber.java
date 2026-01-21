package Example;

public class ArmstrongNumber 
{

	public static void main(String[] args)
	{
		int no=153;
		int temp=no;
		int sum =0;
		
		while(no>0)
		{
			int digit=no%10;
			sum= sum+(digit+digit+digit);
			no=no/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+ " is armstrong number");
		}
		else
		{
			System.out.println(temp+ " is not armstrong number");
		}
	}

}
