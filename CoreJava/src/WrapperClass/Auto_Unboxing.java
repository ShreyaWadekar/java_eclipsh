package WrapperClass;

public class Auto_Unboxing {

	public static void main(String[] args) {
		//autoboxing and unboxing program  for all primitive data types
		byte b=10;
		Byte a =b;
		System.out.println(a);
		
		short s= 20;
		Short t=s;
		System.out.println(t);
		
		int i= 30;
		Integer o=i;
		System.out.println(o);
		
		long l= 50;
		Long m=l;
		System.out.println(m);
		
		float f= 60.0F;
		Float e=f;
		System.out.println(e);
		
		double d= 70.0D;
		Double g=d;
		System.out.println(g);
		
		char c= 's';
		Character h=c;
		System.out.println(h);
		
		boolean b1= true;
		Boolean j=b1;
		System.out.println(j);
		
		//Primitive type to object type autoboxing
		Byte bobj=b;		
		byte b2 = bobj;
		System.out.println(b2);
		
		Short sobj=s;
		short s1= sobj;
		System.out.println(s1);

		Integer iobj=i;
		int i1=iobj;
		System.out.println(i1);
		
		Long  lobj=l;
		long l1=lobj;
		System.out.println(l1);
		
		Float fobj=f;
		float f1=iobj;
		System.out.println(f1);
		
		Double dobj=d;
		double d1=iobj;
		System.out.println(d1);
		
		Character cobj=c;
		char c1=cobj;
		System.out.println(c1);
		
		Boolean b1obj=b1;
		boolean b3=b1obj;
		System.out.println(b3);
		
		//object type to primitive datatype unboxing
		byte b4=bobj;
		Byte b5=b4;
		System.out.println(b5);
		
		short s2=sobj;
		Short s3=s2;
		System.out.println(s3);
		
		int i2=iobj;
		Integer i3=i2;
		System.out.println(i3);
		
	}

}
