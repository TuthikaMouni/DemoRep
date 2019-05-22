package com.pnb.employee;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pnb.employee.daoimpl.EmployeeDaoImpl;
import com.pnb.employee.modal.Employee;
import com.pnb.employee.modal.Login;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	RequestDispatcher dispatcher;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("pass");
		EmployeeDaoImpl daoImpl = new EmployeeDaoImpl();
		List<Login> loginList = daoImpl.loginGet();
		List<Employee> employeeList = daoImpl.employeeGet();
		request.setAttribute("empList", employeeList);
		boolean flag = false;
		for (Login login : loginList) {
			try {
				if (username.equalsIgnoreCase(login.getUsername()) && password.equals(login.getPassword())) {
					System.out.println("Login success");
					dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/employeeDetails.jsp");
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
