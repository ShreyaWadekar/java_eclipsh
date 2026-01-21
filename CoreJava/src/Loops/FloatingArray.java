package Loops;

import java.util.Scanner;

public class FloatingArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Float number:");
		int s= sc.nextInt();
		
		float a[]=new float[s];
		System.out.println("Print the array numbers");
		for(int i=0; i<s; i++)
	    {
	    	a[i]= sc.nextFloat();
	    }
		System.out.println("Print the User defined array");
		for(Float ar : a)
	    {
	    	System.out.println(ar);
	    }
	}

}
