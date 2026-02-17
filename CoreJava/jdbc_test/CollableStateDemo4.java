package jdbc_test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CollableStateDemo4 {

	public static void main(String[] args) {
		try 
		{
			//Step.1: Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step.2: Create connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","root");
			
			//Step.3: Create SQL Statement
			CallableStatement st = con.prepareCall("{ call area_of_Circle(?,?)}");
			st.setDouble(1,7);
			st.registerOutParameter(2, Types.DOUBLE);
			
			//Step.4: Execute sql statement
			st.execute();
			
			 // Step 7: Get return value
            double area = st.getDouble(2);
			
			System.out.println("Area of circle :  "+area);
			//Step.4: Close connection
			st.close();
			con.close();
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
