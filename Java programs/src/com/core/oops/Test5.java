package com.core.oops;
class A5 {
	private A5() {
		System.out.println("A-con");
	}
	void m1() {
		System.out.println("m1-A");
	}
	static A5 getRef() {
		A5 a = new A5();
		return a;
	}
}
public class Test5 {

	public static void main(String[] args) {
		A5 a = A5.getRef();
		a.m1();
	}

}
