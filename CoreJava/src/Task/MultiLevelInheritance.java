package Task;

class person
{
	void details()
	{
		System.out.println("Person collect details");
	}
}

class Employee extends person
{
	void work()
	{
		System.out.println("Employee is Working");
	}
}

class Manager extends Employee
{
	void duty()
	{
		System.out.println("Manager is on Duty");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.details();
		m.duty();
		m.work();

	}

}
