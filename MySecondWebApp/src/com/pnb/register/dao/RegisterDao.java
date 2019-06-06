package com.pnb.register.dao;

import java.util.List;

import com.pnb.register.modal.Expenses;
import com.pnb.register.modal.Login;
import com.pnb.register.modal.Password;
import com.pnb.register.modal.Register;

public interface RegisterDao {
	public List<Login> loginGet();
	public List<Register> registerGet();
	public boolean addRegister(Register register);
	public List<Password> passwordGet();
	public boolean addResetPassword(Password password);
	public List<Expenses> expensesGet();
	public boolean addExpenseRecord(Expenses expenses);
}
