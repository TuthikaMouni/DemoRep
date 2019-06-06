package com.pnb.register.controller;

import java.io.IOException;
//import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.pnb.register.daoimpl.RegisterDaoImpl;
import com.pnb.register.modal.Register;

public class RegisterController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	RequestDispatcher dispatcher;
	RegisterDaoImpl daoImpl = null;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/register.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside post");
		String action = request.getParameter("action");
		System.out.println("action :" + action);
		if(action != null && action.equals("add")) {
			insertRegisterRecord(request, response);
		}
	}
	private void insertRegisterRecord(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside");
		Integer id = null ;
		Register register = new Register();
		daoImpl = new RegisterDaoImpl();
		id = Integer.parseInt(request.getParameter("id"));
		System.out.println("id "+id);
		register.setId(id);
		register.setUsername(request.getParameter("username"));
		register.setEmail(request.getParameter("emailid"));
		register.setPassword(request.getParameter("pass"));
		register.setReenterpassword(request.getParameter("reenterpassword"));
		register.setContact(request.getParameter("contact"));
		boolean addStatus = daoImpl.addRegister(register);
		request.setAttribute("addStatus", addStatus);
		dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/success.jsp");
		dispatcher.forward(request, response);
	}
}
