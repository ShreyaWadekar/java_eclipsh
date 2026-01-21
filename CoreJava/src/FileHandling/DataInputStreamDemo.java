package FileHandling;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamDemo {

	public static void main(String[] args) {
		try 
		{
			
			FileInputStream fis= new FileInputStream("C:\\File Date\\test.txt");
			
			DataInputStream dis= new DataInputStream(fis);
			
			int count = fis.available();
			
			byte[]arr = new byte[count];
			dis.read(arr);
			for(byte b : arr)
			{
				char k =(char)b;
			    System.out.print(k +" ");
			}
			
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
