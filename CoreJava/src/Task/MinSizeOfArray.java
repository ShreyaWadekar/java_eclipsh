package Task;

import java.util.Scanner;

public class MinSizeOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of element:");
		int s=sc.nextInt();
		int arr[]= new int[s];
		System.out.println("Print element of array:");
		   for (int i = 0; i < s; i++) {
	            arr[i] = sc.nextInt();
	        }
		int min=arr[0];
		for(int i=1; i<s;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minimun ellement of array:"+min);
	}

}
