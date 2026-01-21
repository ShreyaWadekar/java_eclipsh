package Array;

public class TwoDArray {

	public static void main(String[] args) {
		
		int jaggedArr[][]= {
				{2,6,7,5},
				{7,8},
				{7,9,0,4}};
		
		for(int i=0;i<jaggedArr.length;i++)
		{
			for(int j=0;j<jaggedArr[i].length;j++)
			{
				System.out.println(jaggedArr[i][j] + " ");
			}
			System.out.println();
		}
}
}
