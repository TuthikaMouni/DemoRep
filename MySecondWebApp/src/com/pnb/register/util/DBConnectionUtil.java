package com.pnb.register.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
	private String DRIVER = "com.mysql.cj.jdbc.Driver";
	private String URL = "jdbc:mysql://localhost:3306/test";
	private String USERNAME = "root";
	private String PASSWORD = "root";
	Connection connection;
	public Connection openConnection() {
		try {
			if(connection == null) {
				Class.forName(DRIVER);
				connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			} else {
				return connection;
			}
		}catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		return connection;
	}
}
