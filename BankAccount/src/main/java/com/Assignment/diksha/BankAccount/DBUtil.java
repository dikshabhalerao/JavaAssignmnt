package com.Assignment.diksha.BankAccount;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	
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
}