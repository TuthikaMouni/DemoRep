package com.core.oops;
class A {
	static {
		System.out.println("class loading");
	}
	A() {
		System.out.println("object creation");
	}
}
public class Test1 {

	public static void main(String[] args) throws Exception{
	Class c = Class.forName("com.core.oops");
	Object obj = c.newInstance();
	}
}
