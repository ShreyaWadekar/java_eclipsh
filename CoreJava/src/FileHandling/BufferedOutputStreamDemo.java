package FileHandling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) 
	{
		try {
			FileOutputStream fout= new FileOutputStream("C:\\File Date\\test.txt");
			
			BufferedOutputStream bout= new BufferedOutputStream(fout);
			
			String s= "Welcome to buffered Stream";
			byte b[]=s.getBytes();
			bout.write(b);
			bout.flush();
			fout.close();
			bout.close();
			System.out.println("Success...");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
