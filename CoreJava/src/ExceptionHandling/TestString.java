package ExceptionHandling;
class EmptyException extends Exception
{
	public EmptyException(String message)
	{
		super(message);
	}
}

public class TestString 
{
	static void checkString(String s) throws EmptyException
	{
		if(s== null)
		{
			throw new EmptyException("Enter valid String Empty String not allowed");
		}
		else
		{
			System.out.println("String : "+s);
		}
	}

	public static void main(String[] args) {
		try {
			checkString(null);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
