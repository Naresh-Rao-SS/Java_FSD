package com.fetch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConfig {
public static  Connection getConnection(Properties props) {
		
		Connection connection=null;
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/db3";
		String username="root";
		String password="nareshrao";
		
		try {
			//load driver
			Class.forName(driver);
			//get connection and store it con  object
			connection=DriverManager.getConnection(url,username,password);
				
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  connection;
	}


}

