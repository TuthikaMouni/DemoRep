package com.core.oops;
class Employee{
	String eid;
	String ename;
	String eaddr;
	public void getEmpDetails() {
		System.out.println("Employee id:"+eid);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee address:"+eaddr);
	}
	
}
class Manager extends Employee{
	Manager(String eid1,String ename1,String eaddr1){
		eid=eid1;
		ename=ename1;
		eaddr=eaddr1;
	}
	public void getManagerDetails() {
		System.out.println("manager Details");
		System.out.println("------------------------");
		getEmpDetails();
		
	}
	
}
class Accountant extends Employee{
	Accountant(String eid1,String ename1,String eaddr1){
		eid=eid1;
		ename=ename1;
		eaddr=eaddr1;
	}
public void getAccountantDetails() {
		System.out.println("Accountant Details");
		System.out.println("----------------------");
	getEmpDetails();
}


	}
class InheritanceEX{
	public static void main(String[] args) {
		Manager m=new Manager("E-111","AAA","hyd");
		m.getManagerDetails();
		System.out.println();
		Accountant acc=new Accountant("E-222","BBB","Hyd");
		acc.getAccountantDetails();
		
	}

}
