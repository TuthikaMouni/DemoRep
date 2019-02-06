package com.login.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.connect.Connect2DB;


public class CreateUserController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	boolean createUserStatus = false;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requetsDispatcherObj;
		String createusername = request.getParameter("createname");
		String createpassword = request.getParameter("createpwd");
		String createcnfpwd = request.getParameter("createcnfpwd");
		String createemail = request.getParameter("createemailid");
		System.out.println("Details :"+createusername+" "+createpassword+" "+createcnfpwd+" "+createemail);
		Connect2DB dbConnection = new Connect2DB();
		try {
			createUserStatus = dbConnection.createuserconnection(createusername, createpassword, createcnfpwd, createemail);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("==createUserStatus=="+createUserStatus);
		if(createUserStatus){
			 requetsDispatcherObj =request.getRequestDispatcher("/WEB-INF/jsp/createusersuccess.jsp");
			 requetsDispatcherObj.forward(request, response);
		}
	}

}
