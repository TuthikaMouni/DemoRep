package com.pnb.first;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Init called");
		final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
		final String DATABASE_URL = "jdbc:mysql://localhost:3306/test" + "?useSSL=false";
		final String USERNAME = "root";
		final String PASSWORD = "root";
		final String SELECT_SQL_QUERY = "select * from mouni_test.employee1";
		Connection connection = null;
		Properties properties = new Properties();
		properties = new Properties();
		properties.setProperty("user", USERNAME);
		properties.setProperty("password", PASSWORD);

		if (connection == null) {
			try {
				Class.forName(DATABASE_DRIVER);
				connection = DriverManager.getConnection(DATABASE_URL, properties);
				PreparedStatement preStmt = connection.prepareStatement(SELECT_SQL_QUERY);
				ResultSet resultSet = preStmt.executeQuery();
				while (resultSet.next()) {
					int empId = resultSet.getInt("emp_id");
					String empName = resultSet.getString("emp_name");
					String empSalary = resultSet.getString("emp_salary");
					String contact = resultSet.getString("emp_contact");
					System.out.println("empId :"+empId +" , "+"empName :" +empName + "empSalary :" +empSalary+"contact :"+contact);
				}
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("pass");
		RequestDispatcher dispatcher;
		try {
			if (username.equalsIgnoreCase("Mounika") && password.equalsIgnoreCase("Test")) {
				request.setAttribute("user", username);
				dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/success.jsp");
				dispatcher.forward(request, response);
			} else {
				dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/failure.jsp");
				dispatcher.forward(request, response);
			}
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		super.service(arg0, arg1);
		System.out.println("Service Method Called");
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Destory called");
	}

}
