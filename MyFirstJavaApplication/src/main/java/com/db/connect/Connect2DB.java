package com.db.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.login.bean.CreateUserBean;
import com.login.bean.LoginBean;

public class Connect2DB {
	private static final String url = "jdbc:mysql://localhost:3306/job_portal"; 
	private static final String user = "root"; 
	private static final String password = "root"; 
	private static Connection con;
	private static Statement stmt; 
	private static ResultSet rs;
	
	public static void connect() throws SQLException, ClassNotFoundException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
	}
	
	public List<LoginBean> connection() throws SQLException, ClassNotFoundException {
		System.out.println("inside connection() :");
		List<LoginBean> loginList = new ArrayList<LoginBean>();
		String query = "SELECT * FROM job_portal.login"; 
		
		connect();
			// opening database connection to MySQL server 
			//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_portal", "root", "root"); 
			System.out.println("==con=="+con);
			// getting Statement object to execute query 
			stmt = con.createStatement(); 
			System.out.println("==stmt=="+stmt);
			// executing SELECT query
			rs = stmt.executeQuery(query); 
			System.out.println("==rs=="+rs);
			while (rs.next()) {
				String username = rs.getString("Username"); 
				String password = rs.getString("Password");
				String email = rs.getString("Email");
				System.out.println("=username:="+username+":password:"+password+"email:"+email);
				LoginBean loginBean = new LoginBean();
				loginBean.setUsername(username);
				loginBean.setPassword(password);
				loginBean.setEmail(email);
				loginList.add(loginBean);
			}

			con.close();
			stmt.close();
			rs.close();
		
		return loginList;
		
	}
	
	public boolean createuserconnection(String name, String pwd, String cnfpwd, String email) throws SQLException, ClassNotFoundException {
		boolean status = false;
		System.out.println("inside createuserconnection() :");
		String query = "INSERT INTO job_portal.login (Username, Password, ConfirmPwd, Email) VALUES (?, ?, ?, ?)"; 
		connect();
		// opening database connection to MySQL server 
		System.out.println("==con=="+con);
		// getting Statement object to execute query 
		PreparedStatement statement = con.prepareStatement(query);
		System.out.println("==stmt=="+statement);
		statement.setString(1, name);
		statement.setString(2, pwd);
		statement.setString(3, cnfpwd);
		statement.setString(4, email);
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
		    System.out.println("A new user was inserted successfully!");
		    status = true;
		}
		return status;
		
	}
	
	public static void main(String[] args) {
		Connect2DB connect2DB =  new Connect2DB();
		try {
			connect2DB.createuserconnection("test","test","test","test@gmail.com");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
