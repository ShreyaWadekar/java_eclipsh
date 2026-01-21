package ExceptionHandling;
class InvalidPasswordException extends Exception
{
	public InvalidPasswordException(String message)
	{
		super(message);
	}
}
public class Invalidpassword 
{
	static void checkidPassword(int id , String pass) throws InvalidPasswordException
	{
		if(id != 123 || !pass.equals("Shreya"))
		{
			throw new InvalidPasswordException("Enter valid use id and password");
		}
		else
		{
			System.out.println("user id : "+id);
			System.out.println("user password : "+pass);
			System.out.println("login Successfully");
		}
	}

	public static void main(String[] args) {
		try {
			checkidPassword(123, "Shreya");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
