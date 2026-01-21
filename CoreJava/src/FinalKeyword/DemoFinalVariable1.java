package FinalKeyword;

class UserAccount
{
	final String accountNumber = "ACC353535";
	public void display()
	{
		System.out.println(accountNumber);
	}
}

public class DemoFinalVariable1 {

	public static void main(String[] args) {
		UserAccount u= new UserAccount();
		u.display();
		

	}

}
