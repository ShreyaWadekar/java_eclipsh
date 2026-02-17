package jdbc_test;

import java.sql.*;

public class Testjdbc {

	public static void main(String[] args) {
		try 
		{
			//Step.1: Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step.2: Create connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","root");
			
			//Step.3: Create sql Statement
			Statement st= con.createStatement();
			
			//Step.4: Execute sql statement
			ResultSet rs = st.executeQuery("select * from person");
			
			while(rs.next())
			{
				System.out.println("Id: "+rs.getInt(1) +" Name: "+rs.getString(2) +" Age: "+rs.getInt(3));
			}
			
			//Step.4: Close connection
			con.close();
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
