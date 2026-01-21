package oops;

class Customer
{
	private String name;   //data hiding
	
	public void setName(String name)
	{
		this.name=name;   //set name method
	}
	
	public String getName()
	{
		return name;
	}
}

public class TestEncapsulation {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setName("Shreya"); //set the name - setter
		System.out.println(c.getClass()); //get the name - getter
	}
}
