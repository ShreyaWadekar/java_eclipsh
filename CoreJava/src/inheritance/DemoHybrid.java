package inheritance;

class User
{
	String name;
	public void login()
	{
		System.out.println(name +" Logged in. ");
	}
}

interface videoPlayer
{
	public void playVideo(String courseName);
}

class Student extends User implements videoPlayer
{
	public void playVideo(String courseName)
	{
		System.out.println("Student is Watching : "+courseName);
	}
}

class Teacher extends User implements videoPlayer
{
	public void playVideo(String courseName)
	{
		System.out.println("Teacher is reviewing video : "+courseName);
	}
}
public class DemoHybrid {

	public static void main(String[] args) {
		Student  s=new Student();
		s.name="Shreya";
		s.login();
		s.playVideo("Java oops concept");

		Teacher t= new Teacher();
		t.name="mr. Dhanger sir";
		t.login();
		t.playVideo("Java oops concept review");
	}

}
