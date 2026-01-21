package recording;

class OverLoadDemo
{
	int show(int id)
	{
		System.out.println("Welcome to Overloading");
		return 0;
	}
	
	String show(int id, String name)
	{
		System.out.println(name + " Welcome to Overloading");
		return name;
	}
	
	void show(String name,String city)
	{
		System.out.println(name+" Welcome to Overloading from "+city);
	}
}

public class OverLoad {

	public static void main(String[] args) {
		OverLoadDemo o= new OverLoadDemo();
		o.show(10);
		o.show(101, "Shreya");
		o.show("Shreya", "Pune");

	}

}
