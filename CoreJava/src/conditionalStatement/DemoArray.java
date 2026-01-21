package conditionalStatement;

public class DemoArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		System.out.println(a[3]);
		
		System.out.println();
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i] +"");
		}
		System.out.println();
		String fruits[] = {"Apple", "Banana", "Orange", "Cherry"};
		for(int i=0; i<fruits.length; i++)
		{
			System.out.print(fruits[i] +" ");
		}
		System.out.println();
		System.out.println("Using for each loop");
		for(String f : fruits)
		{
			System.out.print(f +" ");
		}
		System.out.println();
		for(int i=a.length; i>a[3]; i--)
		{
			System.out.println(a[i] +" ");
		}
		
	}

}
