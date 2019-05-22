package com.pnb.employee.dao;

import java.util.List;

import com.pnb.employee.modal.Employee;
import com.pnb.employee.modal.Login;

public interface EmployeeDao {
	
	public List<Employee> employeeGet();
	public List<Login> loginGet();
	boolean addEmployee(Employee employee);
	boolean updateEmployee(Employee employee);
	boolean deleteEmployee(int employeeid);
}
