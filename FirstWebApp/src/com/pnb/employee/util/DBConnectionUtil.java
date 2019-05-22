package com.pnb.employee.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {

	private String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
	private String DATABASE_URL = "jdbc:mysql://localhost:3306/test" + "?useSSL=false";
	private String USERNAME = "root";
	private String PASSWORD = "root";

	Connection connection;

	public Connection openConnection() {
		try {
			if (connection == null) {
				Class.forName(DATABASE_DRIVER);
				connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
			}else {
				return connection;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
