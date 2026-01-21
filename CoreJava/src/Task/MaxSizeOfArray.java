package Task;

import java.util.Scanner;

public class MaxSizeOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of element:");
		int s=sc.nextInt();
		int arr[]= new int[s];
		System.out.println("Print element of array:");
		   for (int i = 0; i < s; i++) {
	            arr[i] = sc.nextInt();
	        }
		int max=arr[0];
		for(int i=1; i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximun element of array:"+max);
	}

}


