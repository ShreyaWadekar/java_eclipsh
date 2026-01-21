package FinalKeyword;

class Bank
{
	final void proceTransaction()
	{
		System.out.println("Processing Bank transaction");
	}
}

public class DemoFinalMethod extends Bank {

	public void payBill()
	{
		System.out.println("Calling from final Method");
	}
	public static void main(String[] args) {
		DemoFinalMethod d = new DemoFinalMethod();
		d.payBill();
		d.proceTransaction();
	}

}
