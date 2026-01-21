package FileHandling;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {

	public static void main(String[] args) {
		try {
			
			byte buffer[]= {35,36,38,34};
			
			ByteArrayInputStream bis = new ByteArrayInputStream(buffer);
			
			int k =0;
			while((k=bis.read()) !=-1)
			{
				char ch =(char)k;
				System.out.println("ascii value of character is : "+k + " Special character is : "+ch);
			}
			bis.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
