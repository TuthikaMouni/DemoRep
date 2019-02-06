package p1;

import p1.p3.E;

public class A {

	public static void a1() {
		System.out.println("Inside a1");
	}

	public void a2() {
		System.out.println("Inside a2");
		E eObject = new E();
		eObject.e1();
	}
	
}
