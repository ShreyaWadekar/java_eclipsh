package ExceptionHandling;

public class NumberFormate {

	public static void main(String[] args) {
		
		try
		{
			String s= "shreya";
			int  num = Integer.parseInt(s);
		}
		catch (Exception e) {
			System.out.println("Can not canvert string to number.");
		}

	}

}
