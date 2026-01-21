package Constructor;

public class VerifyObject {

	public void info()
	{
		System.out.println(this);
	}
	public static void main(String[] args) {
		
		VerifyObject v = new VerifyObject();
		System.out.println(v);
		v.info();
		
	}

}
