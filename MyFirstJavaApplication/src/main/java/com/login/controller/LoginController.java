package com.login.controller;

import java.io.IOException;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.connect.Connect2DB;
import com.login.bean.LoginBean;

public class LoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static List<LoginBean> dbResult;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("userid");
		String password = request.getParameter("pwd");
	    System.out.println("=Username in Login Controller="+username);
	    System.out.println("=Password in Login Controller="+password);
	    Connect2DB dbConnection = new Connect2DB();
	    System.out.println("==dbConnection=="+dbConnection);
	    RequestDispatcher requetsDispatcherObj;
	    try {
			 try {
				dbResult = dbConnection.connection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("==dbResult=="+dbResult);
			 String usernamFromDb = dbResult.get(0).getUsername();
			 String passwordFromDb = dbResult.get(0).getPassword();
			 System.out.println("=usernamFromDb in Login Controller="+usernamFromDb);
			 System.out.println("=passwordFromDb in Login Controller="+passwordFromDb);
			 if((username.equalsIgnoreCase(usernamFromDb)) && (password.equalsIgnoreCase(passwordFromDb)) ) {
				 System.out.println("success");
				  requetsDispatcherObj =request.getRequestDispatcher("/WEB-INF/jsp/jobposting.jsp");
				  requetsDispatcherObj.forward(request, response);
			 }else {
				 System.out.println("failure");
				 requetsDispatcherObj =request.getRequestDispatcher("/WEB-INF/jsp/failure.jsp");
				 requetsDispatcherObj.forward(request, response);
			 }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	
	

}
