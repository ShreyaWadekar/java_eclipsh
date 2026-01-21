package FileHandling;

import java.io.FileInputStream;

public class ReadDataFromFile {

	public static void main(String[] args)
	{
			try {		
			FileInputStream fs= new FileInputStream("C:\\File Date\\test.text");
			int i;
			while((i=fs.read()) !=-1)
			{
				System.out.print((char)i);
			}
			fs.close();
			
		} catch (Exception e)
		{
			System.out.println(e);
		}


	}

}
