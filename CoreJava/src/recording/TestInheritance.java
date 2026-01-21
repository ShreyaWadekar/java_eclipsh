package recording;

class Employee
{
	int salary=40000;
	String company_name="FCT";
}

class Programmer extends Employee
{
	int bonus=2000;
	String name="Shreya";
	String skill="java";
}

class Tester extends Employee
{
	int bonus=2000;
	String name="sushant";
	String skill="selenium";
}


public class TestInheritance {

	public static void main(String[] args) {
		Programmer p= new Programmer();
		System.out.println("Name : "+p.name+" Salary : "+p.salary+" Bonus : "+p.bonus+" Company : "+p.company_name+" Skill : "+p.skill);
		
		Tester p1= new Tester();
		System.out.println("Name : "+p1.name+" Salary : "+p1.salary+" Bonus : "+p1.bonus+" Company : "+p1.company_name+" Skill : "+p1.skill);
	}

}
