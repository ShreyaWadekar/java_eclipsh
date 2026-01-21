package Loops;

import java.util.Scanner;

public class UserDefinesArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int s = sc.nextInt();
        
        int a[]= new int[4];

	    System.out.println("Print the array elemens");
	    for(int i=0; i<4; i++)
	    {
	    	a[i]= sc.nextInt();
	    }
	    System.out.println("Print the user defined array");
	    for(int ar : a)
	    {
	    	System.out.println(ar);
	    }
	}

	 
}
