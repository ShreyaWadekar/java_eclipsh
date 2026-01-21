package TestAbstraction;

abstract class Bank
{
	abstract int interestrate();
}

class SBI extends Bank
{
	public int interestrate()
	{
		return 5;
	}
}

class Axis extends Bank
{
	public int interestrate()
	{
		return 8;
	}
}

class HDFC extends Bank
{
	public int interestrate()
	{
		return 9;
	}
}


public class TestInterest {

	public static void main(String[] args) {
		Bank b;
		
		b=new SBI();
		System.out.println("Rate of interest in SBI : "+b.interestrate() +"%");
		
		b=new Axis();
		System.out.println("Rate of interest in Axis : "+b.interestrate() +"%");
		
		b=new HDFC();
		System.out.println("Rate of interest in HDFC : "+b.interestrate() +"%");

	}

}
