package com.accessmodifiers.test;

public class DemoAccessModifiers {

	public DemoAccessModifiers() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * This is a default method, 
	 * can be accessed from classes within same package.
	 * 
	 * */
	void defaultMethod() {
		System.out.println("==I'm a default method");
	}
	/*
	 * This is a public method, 
	 * can be accessed from anywhere.
	 * 
	 * */
	public void publicMethod() {
		System.out.println("==I'm a public method");
	}
	/*
	 * This is a private method, 
	 * cannot be accessed from outside class.
	 * 
	 * */
	private void privateMethod() {
		System.out.println("==I'm a private method");
	}
	/*
	 * This is a protected method, 
	 * can be accessed within same package ans sub-class in any package.
	 * 
	 * */
	protected void protectedMethod() {
		System.out.println("==I'm a protected method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
