package ExceptionHandling;

public class NullPointer {

	public static void main(String[] args) {
		String a = null;
		try
		{
			System.out.println("Length : "+a.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("String is null fill  the string. ");
		}
		 System.out.println("Rest of code");

	}

}
