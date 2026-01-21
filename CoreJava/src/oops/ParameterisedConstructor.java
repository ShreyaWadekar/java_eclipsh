package oops;

class StudentTest
{
	int id;
	String name;
	double marks;
	
	public StudentTest(int i, String n, double m)
	{
		id =i;
		name=n;
		marks=m;
	}
	
	public void display()
 	{
 		System.out.println("ID :"+id+ " Name : "+name+ " Marks : "+marks);
 	}
}
 	

public class ParameterisedConstructor {

	public static void main(String[] args) {
		StudentTest s = new StudentTest(101,"Shreya",89.00);
		s.display();
	}

}
