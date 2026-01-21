package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class TestThrowskeyword 
{
	static void  readFile() throws IOException
	{
		
		FileReader fr = new FileReader("text.txt");
	}

	public static void main(String[] args) {
		try {
			readFile();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Rest of code");

	}

}
