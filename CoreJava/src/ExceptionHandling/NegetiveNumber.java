package ExceptionHandling;

class NegativeException extends Exception
{
	public NegativeException(String message)
	{
		super(message);
	}
}

public class NegetiveNumber
{
	static void checkNo(int No) throws NegativeException
	{
		if(No<0)
		{
			throw new NegativeException("Number must be Zero or above");
		}
		else
		{
			System.out.println("Positive No : "+No);
		}
	}
	public static void main(String[] args) {
		
		try {
			checkNo(-6);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
