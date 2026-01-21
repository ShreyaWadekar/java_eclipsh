package inheritance;

interface Phonee {
    public void makeCall();
}

interface Internet
{
	public void browse();
	
}

class SmartPhone implements Phonee, Internet
{
	public void makeCall()
	{
		System.out.println("Making a Call");
	}
	public void browse()
	{
		System.out.println("Browsing the internate");
	}
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		SmartPhone sp= new SmartPhone();
		sp.browse();
		sp.makeCall();

	}

}
