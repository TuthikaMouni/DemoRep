package com.pnb.register.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pnb.register.daoimpl.RegisterDaoImpl;
import com.pnb.register.modal.Password;

public class ResetPasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher dispatcher;
	RegisterDaoImpl daoImpl = null;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/forgetPassword.jsp");
		dispatcher.forward(req, resp);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside post");
		String action = request.getParameter("action");
		System.out.println("action :" + action);
		if(action != null && action.equals("add")) {
			insertPasswordRecord(request, response);
		}
	}
	private void insertPasswordRecord(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside");
		Password password = new Password();
		daoImpl = new RegisterDaoImpl();
		password.setNewpassword(request.getParameter("newpass"));
		password.setReenterpassword(request.getParameter("repass"));
		boolean addStatus = daoImpl.addResetPassword(password);
		request.setAttribute("addStatus", addStatus);
		dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/passwordSuccess.jsp");
		dispatcher.forward(request, response);
	}

}
