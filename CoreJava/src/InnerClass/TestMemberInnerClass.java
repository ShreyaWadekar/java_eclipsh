package InnerClass;

class OuterClass

{
	int x = 100; //OuterClass Variable
	
	class InnerClass
	{
		public void innerMethod()
		{
			System.out.println("value from outer class : "+x);
		}
	}
}

public class TestMemberInnerClass {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		//UPcasting
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.innerMethod();

	}

}
