package Example;

public class PolindromeNumber {

	public static void main(String[] args)
	{
		int no=12321;
		int temp=no;
		int rev=0;
		
		while(no >0)
		{
			int digit=no%10;
			rev=rev*10+digit;
			no=no/10;
		}
		if(temp == rev)
		{
			System.out.println("Polindrome");
		}
		else
		{
			System.out.println("Not polindrome");
		}

	}

}
