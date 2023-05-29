package com.Innovative.Utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionUtils {
	
	private static Connection connection=null;
	private static Properties properties=null;
	
	
	public static Connection openConnection() {
			try {
				properties = new Properties();
			properties.load(ConnectionUtils.class.getClassLoader()
					.getResourceAsStream("db.properties"));
			Class.forName(properties.getProperty("driver"));
			connection=DriverManager.getConnection(properties.getProperty("url"),
			properties.getProperty("user_Name"),
			properties.getProperty("Password"));
//			System.out.println(connection);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return connection;
		
	}
	
	public static void closeConnection(Connection connection) {
		if(connection!=null) {
			
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void closeConnection(Connection connection ,Statement statement) {
		if(statement!=null) {
			
			try {
				connection.close();
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void closeConnection(Connection connection,Statement statement,ResultSet resl) {
		if(resl!=null) {
			
			try {
				closeConnection(connection, statement);
				resl.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
//	this is use to check the connection is open or not
//		System.out.println(openConnection());
	}

}
