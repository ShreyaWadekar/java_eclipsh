package jdbc_test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DBMetaDataDemo {

	public static void main(String[] args)
	{
		try 
		{
			//Step.1: Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step.2: Create connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDB","root","root");
			
			//Step.3: Create SQL Statement
			DatabaseMetaData dbmd = con.getMetaData();
			
			System.out.println("Driver name : "+dbmd.getDriverName());
			System.out.println("Driver version : "+dbmd.getDriverVersion());
			System.out.println("Database version : "+dbmd.getDatabaseProductVersion());
			System.out.println("Database name : "+dbmd.getDatabaseProductName());
			System.out.println("Database Minor Version: "+dbmd.getDatabaseMinorVersion());
			System.out.println("Database Major Version: "+dbmd.getDatabaseMajorVersion());
			System.out.println("Driver Major Version: "+dbmd.getDriverMajorVersion());
			System.out.println("Driver Minor Version: "+dbmd.getDriverMinorVersion());
			
			//Step.4: Close connection
			con.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}

	}

}
