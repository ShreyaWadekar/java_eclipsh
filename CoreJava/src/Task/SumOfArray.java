package Task;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter list of array:");
		int s= sc.nextInt();
		int arr[]=new int [s];
		int sum=0;
		
		System.out.println("Print the given element:");
		for(int i=0; i<s; i++)
		{
			arr[i] = sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("addition of array element:"+sum);
	}

}
