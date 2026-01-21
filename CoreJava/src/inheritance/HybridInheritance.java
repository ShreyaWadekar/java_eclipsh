package inheritance;

interface Printable
{
	public void print();
}

interface Scannable
{
	public void scan();
}

class Machine
{
	public void powerOn()
	{
		System.out.println("Machine is powered on");
	}
}

class printer extends Machine implements Printable, Scannable
{
	public void print()
	{
		System.out.println("Printing is documents");
	}
	public void scan()
	{
		System.out.println("Scanning documents");
	}
	public void status()
	{
		System.out.println("Printer is ready");
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		printer p=new printer();
		p.print();
		p.scan();
		p.powerOn();
		p.status();
	}

}
