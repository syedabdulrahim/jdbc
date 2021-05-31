package com.tcs.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCConnectionManager {

	
	private final String url;
	private final Properties properties;
	
	public JDBCConnectionManager(String host,String dbName,String userName,String password) {
		
		this.url="jdbc:Mysql://"+host+"/"+dbName;
		this.properties=new Properties();
		
		properties.setProperty("user", userName);
		properties.setProperty("password", password);
		
		

	}
	
	public Connection getConnection() throws SQLException{
		
		return DriverManager.getConnection(this.url,this.properties);
		
	} 
	
}
