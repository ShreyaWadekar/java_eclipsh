package jdbc_test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CollableStateDemo3 {

	public static void main(String[] args) {
		try
		{
			//Step.1: Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step.2: Create connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","root");
			
			//Step.3: Create SQL Statement
			CallableStatement state = con.prepareCall("{ call factorial_no(?,?)}");
			state.setInt(1, 10);
			state.registerOutParameter(2, Types.BIGINT);
			
			//Step.4: Execute sql statement
			state.execute();
			
			System.out.println("Factorialn number :  "+state.getLong(2));
			//Step.4: Close connection
			con.close();
		} catch (Exception e) 
		{
			System.out.println(e);
		}

	}

}
