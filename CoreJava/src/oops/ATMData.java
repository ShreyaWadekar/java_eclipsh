package oops;

class ATMAccound
{
	private int pin;
	private double balance;
	
	public void setPin(int pin)
	{
		this.pin = pin;
	}
	
	public double getBalance(int enteredPin)
	{
		if(this.pin == enteredPin)
		{
			return balance;
		}
		else
		{
			System.out.println("Incorrect Pin!");
			return -1;  // Invalid response
		}
	}
	
	public void Credited(int enteredPin, double amount)
	{
		if(enteredPin == pin)
		{
			balance = balance + amount;
			System.out.println("Credited : "+amount);
		}
		else
		{
			System.out.println("Wrong pin");
		}
	}
	
	public void Withdrow(int enteredPin, double amount)
	{
		if(enteredPin == pin)
		{
			balance = balance - amount;
			System.out.println("Withdrow : "+balance);
		}
		else
		{
			System.out.println("Wrong pin");
		}
	}
}

public class ATMData {

	public static void main(String[] args) {
		ATMAccound a = new ATMAccound();
		a.setPin(1111);           //setting pin
		a.Credited(1111, 10000);  //credited
		a.Withdrow(1111, 2000);   //withdrow
		System.out.println("Balance is : "+a.getBalance(1111));  //check balance
	}

}
