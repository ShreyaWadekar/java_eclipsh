package jdbc_test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class pdfStoreDemo {

	public static void main(String[] args) {
		try 
		{
			//Step.1: Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step.2: Create connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","root");
			
			//Step.3: Create sql Statement
			PreparedStatement pst= con.prepareStatement("insert into  pdgtable(name,data) values(?,?)");
			
			pst.setString(1, "Ramdompdf");
			
			FileInputStream input= new FileInputStream("E:\\document\\sperforma.pdf");
			
			pst.setBinaryStream(2, input);
			
			//Step.4: Execute sql statement
			int rs = pst.executeUpdate();
			
			//display the result
			if(rs>0)
			{
				System.out.println("Pdf store Successfully");
			}
			
			//Step.4: Close connection
			input.close();
			con.close();
			
			
		} catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
