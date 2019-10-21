package com.Assignment.diksha.connection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {  //to create database connection only
	
	private static String DB_URL;
	private static String USERNAME;
	private static String PASSWORD;
	
	static 
    {
   	 try
   	 {
   		Properties property=new Properties();
   		property.load(new FileInputStream("jdbc.properties"));
       	 DB_URL =property.getProperty("url");
       	  USERNAME=property.getProperty("username");
       	  PASSWORD=property.getProperty("password");
       
   	 }
   	 catch(IOException e)
   	 {
   		System.out.println(e.getMessage());
   	 }
    }
    public static Connection getConnection()
    {
    	Connection connection = null;
    	
    	try {
    		connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
    	}
    	catch(SQLException se){
    		se.printStackTrace();
    		
    		
    	}
		return connection;
    }
	
	
	
//	
//	private static final String DB_URL = "jdbc:mysql://localhost:3306/student";
//	private static final String USERNAME = "root";
//	private static final String PASSWORD = "root";
//	
//	public static Connection getConnection() {
//		Connection connection = null;
//		try {
//			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
//		}
//		catch(SQLException e) {
//			e.printStackTrace();
//		}
//		
//		return connection;
//	}

}
