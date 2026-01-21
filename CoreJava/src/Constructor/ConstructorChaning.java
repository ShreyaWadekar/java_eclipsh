package Constructor;

class TestStudent
{
	int rollNo;
	String name, course;
	float fee;
	
	public TestStudent(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}
	public TestStudent(int rollNo,String name,String course)
	{
		this(rollNo,name);
		this.course=course;
		
	}
	
	public TestStudent(int rollNo,String name,String course,float fee)
	{
		this(rollNo,name,course);
		this.fee=fee;
	}
	public void display()
	{
		System.out.println("roll Number "+rollNo);
		System.out.println("std Name "+name);
		System.out.println("std Course "+course);
		System.out.println("std Fee "+fee);
	}
}

public class ConstructorChaning {

	public static void main(String[] args) {
		TestStudent t =new TestStudent(101,"Shreyash","BCA");
		t.display();
		
		TestStudent t1 =new TestStudent(102,"Shreya","MCA",50000);
		t1.display();
		
		TestStudent t2 =new TestStudent(103,"Aniket");
		t2.display();

	}

}
