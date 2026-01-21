package Constructor;

class Sample
{
	int id;
	String name;
	
	public Sample(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void display(Sample obj)
	{
		System.out.println("Display methods executed");
		System.out.println("ID: "+id+" Name: "+name);
	}
	public void show()
	{
		System.out.println("Show method executed.");
		display(this);
	}
	public void info()
	{
		System.out.println("info method executed.");
		display(this);
	}
}
public class PassMethodArgument {

	public static void main(String[] args) {
		Sample s = new Sample(101,"shreya");
		s.show();
		
		Sample s1 = new Sample(102,"Sushant");
		s1.info();
	}

}
