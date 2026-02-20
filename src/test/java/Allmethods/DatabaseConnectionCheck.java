package Allmethods;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class DatabaseConnectionCheck {
	
	@Test
	public void ConnectionCheck() throws SQLException {


Connection connection =	DriverManager.getConnection("jdbc:mysql://localhost:8080", "root", "password");
	
	if (connection.isClosed())
	{
		System.out.println("connection is failed");
	}else {
		
		System.out.println("connected sucessfully");
	}
	}

}
