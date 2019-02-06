package com.db.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Java2MysqlConnection {
	private static final String url = "jdbc:mysql://localhost:3306/job_portal"; 
	private static final String user = "root"; 
	private static final String password = "root"; 
	private static Connection con;
	private static Statement stmt; 
	private static ResultSet rs;

	public static void main(String[] args) throws SQLException {
		String query = "SELECT * FROM job_portal.login"; 
		try {
			// opening database connection to MySQL server 
			con = DriverManager.getConnection(url, user, password); 
			// getting Statement object to execute query 
			stmt = con.createStatement(); 
			// executing SELECT query
			rs = stmt.executeQuery(query); 
			while (rs.next()) {
				String username = rs.getString(1); 
				String password = rs.getString(2);
				System.out.println("=username:="+username+":password:"+password);
			}

		}catch(SQLException ex) {
			con.close();
			stmt.close();
			rs.close();
		}
	}
}
