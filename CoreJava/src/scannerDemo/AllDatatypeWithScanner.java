package scannerDemo;

import java.util.Scanner;

public class AllDatatypeWithScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int
		System.out.println("Enter an integer : ");
		int myInt = sc.nextInt();
		
		//long
		System.out.println("Enter a Long number :");
		long myLong  = sc.nextLong();
		
		//Float
		System.out.println("Enter a Float number :");
		float myFloat  = sc.nextFloat();
		
		//Double
		System.out.println("Enter a Double number :");
		double myDouble  = sc.nextDouble();
		
		//boolean
		System.out.println("Enter a True or False:");
		boolean myBoolean  = sc.nextBoolean();
		
		//char
		System.out.println("Enter a single character :");
		char myChar  = sc.next().charAt(0);
		
		//String
		sc.nextLine();
		System.out.println("Enter a String with space  :");
		String myString  = sc.nextLine();
		
		//Output of all values
		System.out.println();
		
		System.out.println("integer :"+myInt);
		System.out.println("Long :"+myLong);
		System.out.println("Float :"+myFloat);
		System.out.println("Double :"+myDouble);
		System.out.println("Boolean :"+myBoolean);
		System.out.println("Character :"+myChar);
		System.out.println("String :"+myString);
		
	}

}
