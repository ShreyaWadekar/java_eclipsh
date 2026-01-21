package ExceptionHandling;

public class StringIndex {

	public static void main(String[] args) {
		String a = "Java";
		
		try
		{
			System.out.println("Print the character :  "+a.charAt(5));
		}
		catch (Exception e) {
			System.out.println("can not add out of bound string index.");
		}
		finally
		{
			System.out.println("Finally block executed");
		}

	}

}
