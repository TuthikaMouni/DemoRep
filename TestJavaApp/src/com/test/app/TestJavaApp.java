package com.test.app;

public class TestJavaApp {
	
	public static String welcome() {
		return "Welcome to Java Programming";
	}
	 
	public static void main(String[] args) {
		 TestJavaApp testJavaApp = new TestJavaApp();
		 System.out.println("==Output=="+testJavaApp.welcome());
	}
}
