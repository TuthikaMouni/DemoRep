package com.login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.connect.EmailNotification;

public class ProfileController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	boolean status = false;
	RequestDispatcher requetsDispatcherObj;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("==inside profile controller==");
		
		String firstname = request.getParameter("firstname");
		String email = request.getParameter("profileemail");
	    System.out.println("=firstname in profile Controller="+firstname);
	    System.out.println("=email in profile Controller="+email);
	    EmailNotification emailNotification = new EmailNotification();
	    status = emailNotification.sendJobNotifactionEmail(email, firstname);
	    System.out.println("=status="+status);
	    if(status) {
	    	requetsDispatcherObj =request.getRequestDispatcher("/success.jsp");
			requetsDispatcherObj.forward(request, response);
	    }
	}

}
