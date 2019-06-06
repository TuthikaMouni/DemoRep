package com.pnb.register.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pnb.register.daoimpl.RegisterDaoImpl;
import com.pnb.register.modal.Expenses;

public class ExpensesController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	RequestDispatcher dispatcher;
	RegisterDaoImpl daoImpl = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action != null && action.equals("back")) {
			expenseList(request, response);
		}else {
			dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/addExpense.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside post");
		String action = request.getParameter("action");
		System.out.println("action :" + action);
		if (action != null && action.equals("add")) {
			insertExpenseRecord(request, response);
		}
	}

	private void insertExpenseRecord(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("inside");
		Expenses expenses = new Expenses();
		daoImpl = new RegisterDaoImpl();
		expenses.setExpensetype(request.getParameter("exptype"));
		expenses.setExpenseamount(request.getParameter("expamount"));
		boolean addStatus = daoImpl.addExpenseRecord(expenses);
		request.setAttribute("addStatus", addStatus);
		dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/addExpense.jsp");
		dispatcher.forward(request, response);
	}

	private void expenseList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		daoImpl = new RegisterDaoImpl();
		List<Expenses> expenseList = daoImpl.expensesGet();
		request.setAttribute("expenseList", expenseList);
		dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/expenses.jsp");
		dispatcher.forward(request, response);
	}
}
