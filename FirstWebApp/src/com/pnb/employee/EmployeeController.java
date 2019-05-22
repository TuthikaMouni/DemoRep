package com.pnb.employee;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pnb.employee.daoimpl.EmployeeDaoImpl;
import com.pnb.employee.modal.Employee;
//import com.pnb.employee.modal.Employee;
import com.pnb.employee.modal.Login;

public class EmployeeController extends HttpServlet {

	RequestDispatcher dispatcher;
	EmployeeDaoImpl daoImpl = null;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println("action :" + action);

		if (action == "delete") {
			deleteEmployeeRecord(request, response);
		} else if (action == "update") {
			updateEmployeeRecord(request, response);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Employee employee = new Employee();
		daoImpl = new EmployeeDaoImpl();
		employee.setEmpid(Integer.parseInt(request.getParameter("emp_id")));
		employee.setEmpname(request.getParameter("emp_name"));
		employee.setEmpsalary(request.getParameter("emp_salary"));
		employee.setEmpcontact(request.getParameter("emp_contact"));
		employee.setEmpdob(request.getParameter("emp_dob"));
		employee.setEmpdoj(request.getParameter("emp_doj"));
		boolean add = daoImpl.addEmployee(employee);
		List<Employee> employeeList = daoImpl.employeeGet();
		request.setAttribute("empList", employeeList);
		dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/employeeDetails.jsp");
		dispatcher.forward(request, response);
		request.setAttribute("empAddStatus", add);
	}

	private void deleteEmployeeRecord(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside");
		daoImpl = new EmployeeDaoImpl();
		int empId = Integer.parseInt(request.getParameter("emp_id"));
		System.out.println("empId :"+empId);
		boolean deleteStatus = daoImpl.deleteEmployee(empId);
		List<Employee> employeeList = daoImpl.employeeGet();
		request.setAttribute("empList", employeeList);
		dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/employeeDetails.jsp");
		dispatcher.forward(request, response);
		request.setAttribute("empDeleteatus", deleteStatus);
	}

	private void updateEmployeeRecord(HttpServletRequest request, HttpServletResponse response) {
		Employee employee = new Employee();
		daoImpl = new EmployeeDaoImpl();
		employee.setEmpid(Integer.parseInt(request.getParameter("id")));
	}
}