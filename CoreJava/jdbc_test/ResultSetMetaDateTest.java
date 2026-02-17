package jdbc_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultSetMetaDateTest {

	public static void main(String[] args) {

		try 
		{
			//Step.1: Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step.2: Create connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","root");
			
			//Step.3: Create SQL Statement
			PreparedStatement p= con.prepareStatement("select * from person");
			
			//Step.4: Execute sql statement
			ResultSet rs= p.executeQuery();
			
			ResultSetMetaData rmd = rs.getMetaData();
			
			System.out.println("Total number of Columns : "+rmd.getColumnCount());
			System.out.println("Name of First column : "+rmd.getColumnName(1));
			System.out.println("Type name of First Column : "+rmd.getColumnTypeName(1));
			System.out.println("Type of First Column : "+rmd.getColumnType(1));
			System.out.println("Label of Second Column : "+rmd.getColumnLabel(2));
			System.out.println("Display size of third Column : "+rmd.getColumnDisplaySize(3));
			//Step.4: Close connection
			con.close();
			
			
		} catch (Exception e) 
		{
			System.out.println(e);
		}
	}

}
