package ObjectClass;

class TestObject
{
	int a,b;
	
	public TestObject(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int add()
	{
		return a+b;
	}
}

public class TestObjectClassMethod {

	public static void main(String[] args) {
		TestObject t=new TestObject(7,15);
		System.out.println(t.add());
		System.out.println(t.getClass());
		System.out.println(t.hashCode());
		
		TestObject t1=new TestObject(7,15);
		System.out.println(t1.hashCode());
		
		System.out.println(t1.equals(t));
		t1=t;
		System.out.println(t1.equals(t));
		System.out.println(t1.hashCode());
	}

}
