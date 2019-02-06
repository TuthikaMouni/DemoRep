package com.core.oops;
class A7 {
	void m1() {
		System.out.println("m1-A");
	}
}
class B extends A7 {
	final void m1() {
		System.out.println("m1-B");
	}
}
public class Test7 {

	public static void main(String[] args) {
		A7 a = new A7();
		a.m1();
	}

}
