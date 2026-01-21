package ExceptionHandling;

import java.io.FileReader;

public class FileNotFoundException {

	public static void main(String[] args) throws java.io.FileNotFoundException {
		try
		{
			FileReader f = new FileReader("missing.txt");
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("File not found.");
		}

	}

}
