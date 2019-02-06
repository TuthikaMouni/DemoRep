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
import com.db.connect.EmailNotification;
import com.login.bean.LoginBean;

public class PasswordController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static List<LoginBean> dbResult;
	public String emailFromDb;
	public String passwordFromDb;
	boolean status = false;
	RequestDispatcher requetsDispatcherObj;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("forgotpassword");
		System.out.println("==email=="+email);
		Connect2DB connectdb = new Connect2DB();
		EmailNotification emailNotification = new EmailNotification();
		
		try {
			dbResult = connectdb.connection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for(int i=0;i<dbResult.size();i++) {
			emailFromDb = dbResult.get(i).getEmail();
			passwordFromDb = dbResult.get(i).getPassword();
			if((null != emailFromDb) && (emailFromDb.equalsIgnoreCase(email))) {
				//send email
				status = emailNotification.sendEmail(emailFromDb, passwordFromDb);
				System.out.println("==Email Status=="+status);
			}
		}
		if(status){
			 requetsDispatcherObj =request.getRequestDispatcher("/index.jsp");
			 requetsDispatcherObj.forward(request, response);
		}
	}

}
