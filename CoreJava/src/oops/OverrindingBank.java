package oops;

class Bank
{
	void interest()
	{
		System.out.println("General interest");
	}
}

class Sbi extends Bank
{
	void interest()
	{
		super.interest();
		System.out.println("SBI interest 6%");
	}
}

public class OverrindingBank {

	public static void main(String[] args) {
		Bank b= new Sbi();
		b.interest();

	}

}
