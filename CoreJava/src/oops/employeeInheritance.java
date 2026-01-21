package oops;

class employee
{
	void work()
	{
		System.out.println("Employee is working");
	}
}

class Developer extends employee
{
	void code()
	{
		System.out.println("Developer write a code");
	}
}

public class employeeInheritance {

	public static void main(String[] args) {
		Developer d= new Developer();
		d.work();
		d.code();

	}

}
