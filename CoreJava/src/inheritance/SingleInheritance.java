package inheritance;

class person
{
	public void showName()
	{
		System.out.println("Name : John doe");
	}
}

class Employee extends person
{
	public void showJob()
	{
		System.out.println("Job : Software Developer");
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.showName();
		emp.showJob();
		
		//Employee is a person
	}

}
