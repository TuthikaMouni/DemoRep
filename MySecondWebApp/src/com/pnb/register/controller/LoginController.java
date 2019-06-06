package com.pnb.register.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pnb.register.daoimpl.RegisterDaoImpl;
import com.pnb.register.modal.Expenses;
import com.pnb.register.modal.Login;
import com.pnb.register.modal.Register;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	RequestDispatcher dispatcher;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		System.out.println("Inside doget");
		String username = request.getParameter("username");
		String password = request.getParameter("pass");
		RegisterDaoImpl daoImpl = new RegisterDaoImpl();
		List<Login> loginList = daoImpl.loginGet();
		List<Register> registerList = daoImpl.registerGet();
		request.setAttribute("regList", registerList);
		session.setAttribute("user", username);
		boolean flag = false;
		for (Login login : loginList) {
			try {
				if (username.equalsIgnoreCase(login.getUsername()) && password.equals(login.getPassword())) {
					System.out.println("Login success");
					List<Expenses> expenseList = daoImpl.expensesGet();
					request.setAttribute("expenseList", expenseList);
					dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/expenses.jsp");
					dispatcher.forward(request, response);
					flag = true;
				}
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("flag :" + flag);
		if (flag == false) {
			try {
				dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/failure.jsp");
				dispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
		}
	}
}

