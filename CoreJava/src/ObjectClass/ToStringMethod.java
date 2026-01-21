package ObjectClass;

class Student
{
	int rollNo;
	String name;
	 
	public Student(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public void show()
	{
		System.out.println("Roll Number : "+rollNo);
		System.out.println("Name of Std : "+name);
	}
	
	public String toString()
	{
		//return "Student id : "+rollNo +", Student Name : "+name;
		//String s1= new String("id : "+rollNo + ", Name: "+name);
		//return s1;
		return "id: ".concat(rollNo + " ").concat(", Name: ").concat(name) ;
	}
}

public class ToStringMethod {

	public static void main(String[] args) {
		Student s = new Student(101,"Shreya");
		//s.show();
		System.out.println(s);
	}

}
