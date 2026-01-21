package ExceptionHandling;

public class ArrayIndex {

	public static void main(String[] args) {
		
		try
		{
			int a[]= {12, 34,56,78};
			System.out.println(a[6]);
		}
		catch (Exception e) {
			System.out.println("Array index out of bound.");
		}

}
}
