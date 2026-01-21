package scannerDemo;

import java.util.Scanner;

public class TestScanner {
	int no1;
	int no2;
	int res;
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no1:");
		int no1= sc.nextInt();
		System.out.println("Enter no2:");
		int no2= sc.nextInt();
		int res=no1+no2;
		System.out.println("no1+no2="+res);
		

	}

}
