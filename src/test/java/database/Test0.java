package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class Test0 {
	@Test
	public void db() throws SQLException {
		//Step:1 register the database
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		
		//step:2 conncet to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/api107","root","root");
		
		//Step:3 create sql query statement
		Statement s = con.createStatement();
		String query="select * from apitable";
		
		//Step:4 execute the query
		ResultSet result = s.executeQuery(query);
		
		while(result.next()) {
			System.out.println(result.getString(1));
			System.out.println(result.getString(2));
		}
		
		//Step:5 close the conncetion
		con.close();
		
		
		
	}

}

