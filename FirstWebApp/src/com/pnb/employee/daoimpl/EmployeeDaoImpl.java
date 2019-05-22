package com.pnb.employee.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pnb.employee.dao.EmployeeDao;
import com.pnb.employee.modal.Employee;
import com.pnb.employee.modal.Login;
import com.pnb.employee.util.DBConnectionUtil;

public class EmployeeDaoImpl implements EmployeeDao {
	String QUERY = "select * from mouni_test.login";
	String EMP_DETAILS_QUERY = "select * from mouni_test.employee";
	String EMP_ADD_QUERY = "insert into mouni_test.employee(emp_id,emp_name,emp_salary,emp_contact,emp_dob,emp_doj) values(?,?,?,?,?,?)";
	String EMP_UPDATE_QUERY = "update mouni_test.employee set emp_name=?,emp_salary=?,emp_contact=?,emp_dob=?,emp_doj=? where emp_id=?";
	DBConnectionUtil dbutil = new DBConnectionUtil();

	@Override
	public List<Employee> employeeGet() {
		List<Employee> empList = null;
		Employee employee = null;
		Connection connection = dbutil.openConnection();
		try {
			empList = new ArrayList<Employee>();
			PreparedStatement psmt = connection.prepareStatement(EMP_DETAILS_QUERY);
			ResultSet resultSet = psmt.executeQuery();
			
			while (resultSet.next()) {
				employee = new Employee();
				employee.setEmpid(resultSet.getInt("emp_id"));
				employee.setEmpname(resultSet.getString("emp_name"));
				employee.setEmpsalary(resultSet.getString("emp_salary"));
				employee.setEmpcontact(resultSet.getString("emp_contact"));
				employee.setEmpdob(resultSet.getString("emp_dob"));
				employee.setEmpdoj(resultSet.getString("emp_doj"));
				empList.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empList;
	}
	public boolean addEmployee(Employee employee) {
		boolean addStatus = false;
		Connection connection = dbutil.openConnection();
		PreparedStatement psmt;
		try {
			psmt = connection.prepareStatement(EMP_ADD_QUERY);
			psmt.setInt(1,employee.getEmpid());
			System.out.println("Emp Id"+employee.getEmpid());
			psmt.setString(2,employee.getEmpname());
			psmt.setString(3,employee.getEmpsalary());
			psmt.setString(4,employee.getEmpcontact());
			psmt.setString(5,employee.getEmpdob());
			psmt.setString(6,employee.getEmpdoj());
			System.out.println("Query generated");
			int rowInserted = psmt.executeUpdate();
			System.out.println("resultset "+rowInserted);
			if(rowInserted > 0) {
				addStatus = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("addstatus "+addStatus);
		return addStatus;
	}
	public boolean updateEmployee(Employee employee) {
		boolean updateStatus = false;
		Connection connection = dbutil.openConnection();
		PreparedStatement psmt;
		try {
			psmt = connection.prepareStatement(EMP_UPDATE_QUERY);
			psmt.setString(2,employee.getEmpname());
			psmt.setString(3,employee.getEmpsalary());
			psmt.setString(4,employee.getEmpcontact());
			psmt.setString(5,employee.getEmpdob());
			psmt.setString(6,employee.getEmpdoj());
			int rowUpdated = psmt.executeUpdate();
			System.out.println("resultset "+rowUpdated);
			if(rowUpdated > 0) {
				updateStatus = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("addstatus "+updateStatus);
		return updateStatus;
	}
	public boolean deleteEmployee(int employeeid) {
		String EMP_DELETE_QUERY = "delete from mouni_test.employee where emp_id="+employeeid;
		System.out.println("Delete Query "+EMP_DELETE_QUERY);
		boolean deleteStatus = false;
		Connection connection = dbutil.openConnection();
		PreparedStatement psmt;
		try {
			psmt = connection.prepareStatement(EMP_DELETE_QUERY);
			int rowDeleted = psmt.executeUpdate();
			System.out.println("resultset "+rowDeleted);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("addstatus "+deleteStatus);
		return deleteStatus;
	}
	public List<Login> loginGet() {
		List<Login> loginList = null;
		Login login = null;
		Connection connection = dbutil.openConnection();
		try {
			loginList = new ArrayList<Login>();
			PreparedStatement psmt = connection.prepareStatement(QUERY);
			ResultSet resultSet = psmt.executeQuery();
			while (resultSet.next()) {
				login = new Login();
				login.setEmpid(resultSet.getInt("emp_id"));
				login.setUsername(resultSet.getString("username"));
				login.setPassword(resultSet.getString("password"));
				loginList.add(login);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return loginList;
	}
}
