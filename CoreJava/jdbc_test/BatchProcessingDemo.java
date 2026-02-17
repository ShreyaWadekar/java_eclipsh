package jdbc_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class BatchProcessingDemo {

	public static void main(String[] args) {
		try 
		{
			//Step.1: Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step.2: Create connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","root");
			con.setAutoCommit(false);
			
			//Step.3: Create SQL Statement
			Statement st = con.createStatement();
			
			//Step.4: Execute sql statement
			st.addBatch("insert into person(id,name,age) values(106,'John',45)");
			st.addBatch("insert into person(id,name,age) values(107,'Ronny',35)");
			
			st.executeBatch();
			System.out.println("Records inserting");
			//Step.4: Close connection
			con.commit();
			con.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}

	}

}
