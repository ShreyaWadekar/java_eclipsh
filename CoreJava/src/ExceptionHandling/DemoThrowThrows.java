package ExceptionHandling;

public class DemoThrowThrows 
{
	static void withdrow(int balance, int amount) throws Exception
	{
		if(amount > balance)
		{
			throw new Exception("Insufficient balance");
		}
		
		System.out.println("please collect your cash");
	}

	public static void main(String[] args) {

		try {
			withdrow(5000, 7000);
		} catch (Exception e) {
			System.out.println("transaction failed : "+e.getMessage());
			
		}
		System.out.println("Rest of code");

	}

}
