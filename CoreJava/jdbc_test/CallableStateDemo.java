package jdbc_test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CallableStateDemo {

	public static void main(String[] args) {
		try {
			//Step.1: Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step.2: Create connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","root");
			
			//Step.3: Create sql Statement
			CallableStatement cs= con.prepareCall("{call person(?)}");
			cs.setInt(1, 104);
			
			//Step.4: Execute sql statement
			cs.execute();
			
			
			System.out.println("Deletion successfully");
			
			//Step.4: Close connection
			con.close();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}

	}

}
