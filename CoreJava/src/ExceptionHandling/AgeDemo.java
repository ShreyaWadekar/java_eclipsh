package ExceptionHandling;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}

public class AgeDemo 
{
	static void checkAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Age must be 18 or above");
		}
		else
		{
			System.out.println("valid Age : "+age);
		}
	}
	public static void main(String[] args) {
		try {
			checkAge(20);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
