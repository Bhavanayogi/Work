package testNG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DatabaseTesting {
	
	// We can fetch, insert,update & delete data from the database using below
	
	@Test
	
	public void databaseTest() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");  //Even though if we don't write this line we are getting the output
		System.out.println("Driver loaded");
		
		// Creating connection in below step
		Connection con = DriverManager.getConnection("jdbc:mysql://rcippwdbmys001.realpage.com:3306/irepm_control","pwdev","pwdev");
		System.out.println("Connected to My SQL DB");
		
		Statement smt= con.createStatement();
		String s= "select * from login_user where status = 'ACT' and system_id= 196542495 limit 10";
		
		//As the above statement returns data, it need to be stored in a ResultSet variable
		ResultSet rs=smt.executeQuery(s);
		
		System.out.println("Database records are ::");
		while(rs.next())
		{
			String firstName= rs.getString("first_name");
			System.out.println(firstName);
		}
		
		//closing the connection
		con.close();
	}

}
