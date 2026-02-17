package jdbc_test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CollableStateDemo2 {

	public static void main(String[] args)
	{
		try
		{
			//Step.1: Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step.2: Create connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","root");
			
			//Step.3: Create SQL Statement
			CallableStatement state = con.prepareCall("{ call square_of_no(?,?)}");
			state.setInt(1, 5);
			state.registerOutParameter(2, Types.DOUBLE);
			
			//Step.4: Execute sql statement
			state.execute();
			
			System.out.println("Square of a number :  "+state.getDouble(2));
			
			//Step.4: Close connection
			con.close();
			
		} catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
