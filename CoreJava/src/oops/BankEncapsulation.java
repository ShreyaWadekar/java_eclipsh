package oops;

class BankAccount
{
	private double balance;
	
	public void setbalance(double balance)
	{
		this.balance=balance;
	}
	
	public double getbalance() 
	{
		return balance;
	}
}

public class BankEncapsulation {

	public static void main(String[] args) 
	{
		BankAccount b = new BankAccount();
		b.setbalance(50000.00);
		System.out.println("Balance : "+b.getbalance());
	}

}
