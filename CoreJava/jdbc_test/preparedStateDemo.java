package jdbc_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class preparedStateDemo {

	public static void main(String[] args) {
		try {
			//Step.1: Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step.2: Create connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","root");
			
			//Step.3: Create sql Statement
			PreparedStatement pst= con.prepareStatement("insert into person values(?,?,?)");
			
			pst.setInt(1, 104);
			pst.setString(2, "Pratap");
			pst.setInt(3, 29);
			
			//Step.4: Execute sql statement
			int i = pst.executeUpdate();
			
			System.out.println(i +"Record Inserted");
			
			//Step.4: Close connection
			con.close();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}

	}

}
