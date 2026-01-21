package SuperKeywords;

class BankAccount
{
	String BankName = "State Bank Of India";
	
	public BankAccount(int id)
	{
		System.out.println(id);
		System.out.println("Bank Account Constructor called");
	}
	
	public void displayAcccountType()
	{
		System.out.println("Account Type : General Bank Account");
	}
}

class SavingAccount extends BankAccount
{
	String BankName = "HDFC";
	
	public SavingAccount()
	{
		super(100);
		super.displayAcccountType();
		System.out.println("Saving Account Constructor Called");
	}
	
	public void displayDetails()
	{
		System.out.println("Child Bank name :  "+BankName);
		System.out.println("parent Bank name :  "+super.BankName);
	}
}

public class TestAccount {

	public static void main(String[] args) {
		SavingAccount s= new SavingAccount();
		s.displayDetails();
		

	}

}
