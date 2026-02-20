package Allmethods;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionCheckTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

Connection connection =	DriverManager.getConnection("jdbc:mysql://localhost:8080", "root", "password");
	
	if (connection.isClosed())
	{
		System.out.println("connection is failed");
	}else {
		
		System.out.println("connected sucessfully");
	}
	}

}
