package com.pnb.register.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pnb.register.modal.Expenses;
import com.pnb.register.modal.Login;
import com.pnb.register.modal.Password;
import com.pnb.register.dao.RegisterDao;
import com.pnb.register.modal.Register;
import com.pnb.register.util.DBConnectionUtil;

public class RegisterDaoImpl implements RegisterDao{
	String QUERY = "select * from mouni_test.register";
	String INSERT_QUERY = "insert into mouni_test.register(id,username,emailid,password,reenterpassword,contact) values(?,?,?,?,?,?)";
	String PASSWORD_QUERY = "insert into mouni_test.passwordresetform(New_password,Reenter_password) values(?,?)";
	String EXPENSE_QUERY = "insert into mouni_test.expenses(ExpenseType,ExpenseAmount) values(?,?)";
	DBConnectionUtil dbutil = new DBConnectionUtil();
	public List<Register> registerGet() {
		List<Register> registerList = null;
		Register register = null;
		Connection connection = dbutil.openConnection();
		try {
			registerList = new ArrayList<Register>();
			PreparedStatement psmt;
			psmt = connection.prepareStatement(QUERY);
			ResultSet resultSet = psmt.executeQuery();
			while(resultSet.next()) {
				register = new Register();
				register.setId(resultSet.getInt("id"));
				register.setUsername(resultSet.getString("username"));
				register.setEmail(resultSet.getString("emailid"));
				register.setPassword(resultSet.getString("password"));
				register.setReenterpassword(resultSet.getString("reenterpassword"));
				register.setContact(resultSet.getString("contact"));
				registerList.add(register);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return registerList;
	}
	public boolean addRegister(Register register) {
		boolean addStatus = false;
		Connection connection = dbutil.openConnection();
		PreparedStatement psmt;
		try {
			psmt = connection.prepareStatement(INSERT_QUERY);
			psmt.setInt(1, register.getId());
			System.out.println("Id" + register.getId());
			psmt.setString(2, register.getUsername());
			psmt.setString(3, register.getEmail());
			psmt.setString(4, register.getPassword());
			psmt.setString(5, register.getReenterpassword());
			psmt.setString(6, register.getContact());
			System.out.println("Query generated");
			int rowInserted = psmt.executeUpdate();
			addStatus = true;
			System.out.println("resultset " + rowInserted);
			if (rowInserted > 0) {
				addStatus = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("addstatus " + addStatus);
		return addStatus;
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
				login.setEmpid(resultSet.getInt("id"));
				login.setUsername(resultSet.getString("username"));
				login.setPassword(resultSet.getString("password"));
				loginList.add(login);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return loginList;
	}
	public List<Password> passwordGet() {
		List<Password> passwordList = null;
		Password password = null;
		String QUERY = "select * from mouni_test.passwordresetform";
		Connection connection = dbutil.openConnection();
		try {
			passwordList = new ArrayList<Password>();
			PreparedStatement psmt = connection.prepareStatement(QUERY);
			ResultSet resultSet = psmt.executeQuery();
			while (resultSet.next()) {
				password = new Password();
				password.setId(resultSet.getInt("id"));
				password.setNewpassword(resultSet.getString("newpass"));
				password.setReenterpassword(resultSet.getString("repass"));
				passwordList.add(password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return passwordList;
	}
	public boolean addResetPassword(Password password) {
		boolean addStatus = false;
		Connection connection = dbutil.openConnection();
		PreparedStatement psmt;
		try {
			psmt = connection.prepareStatement(PASSWORD_QUERY);
			psmt.setString(1, password.getNewpassword());
			psmt.setString(2, password.getReenterpassword());
			System.out.println("Query generated");
			int rowInserted = psmt.executeUpdate();
			addStatus = true;
			System.out.println("resultset " + rowInserted);
			if (rowInserted > 0) {
				addStatus = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("addstatus " + addStatus);
		return addStatus;
	}
	public List<Expenses> expensesGet() {
		List<Expenses> expenseList = null;
		Expenses expenses = null;
		String QUERY = "select * from mouni_test.expenses";
		Connection connection = dbutil.openConnection();
		try {
			expenseList = new ArrayList<Expenses>();
			PreparedStatement psmt = connection.prepareStatement(QUERY);
			ResultSet resultSet = psmt.executeQuery();
			while (resultSet.next()) {
				expenses = new Expenses();
				expenses.setId(resultSet.getInt("ExpenseId"));
				expenses.setExpensetype(resultSet.getString("ExpenseType"));
				expenses.setExpenseamount(resultSet.getString("ExpenseAmount"));
				expenseList.add(expenses);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return expenseList;
	}
	@Override
	public boolean addExpenseRecord(Expenses expenses) {
		boolean addStatus = false;
		Connection connection = dbutil.openConnection();
		PreparedStatement psmt;
		try {
			psmt = connection.prepareStatement(EXPENSE_QUERY);
			psmt.setString(1, expenses.getExpensetype());
			psmt.setString(2, expenses.getExpenseamount());
			System.out.println("Query generated");
			int rowInserted = psmt.executeUpdate();
			addStatus = true;
			System.out.println("resultset " + rowInserted);
			if (rowInserted > 0) {
				addStatus = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("addstatus " + addStatus);
		return addStatus;
	}
}
