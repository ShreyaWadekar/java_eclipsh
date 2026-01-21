package ExceptionHandling;

class ShreyaException extends Exception
{
	public ShreyaException(String msg)
	{
		super(msg);
	}
}

public class CustomException {

	public static void main(String[] args) {
		try {
			throw new ShreyaException("this is my own exception");
			
		} catch (ShreyaException e) {
			System.out.println(e);
		}

	}

}
