package jdbc_test;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class imgReadDemo {

	public static void main(String[] args) {
		try 
		{
			//Step.1: Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step.2: Create connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","root");
			
			//Step.3: Create sql Statement
			PreparedStatement pst= con.prepareStatement("select * from imgtable");
			
			ResultSet rs= pst.executeQuery();
			
			if(rs.next())
			{
				Blob b = rs.getBlob(2);
				byte brr[] = b.getBytes(1, (int)b.length());
				
				FileOutputStream out = new FileOutputStream("D:\\image\\Personimage.jpg");
				
				out.write(brr);
				out.close();
			}
			
			//Step.4: Close connection
			con.close();
			System.out.println("Image read Successfully");

		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
