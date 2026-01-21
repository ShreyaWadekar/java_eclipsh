package Constructor;

class A
{
	A getA()
	{
		return this;
	}
	
	public void message()
	{
		System.out.println("Welcome in this keyword");
	}
}

public class ReturnReferenceObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A().getA().message();
		
		}
}
