package com.core.oops;
class A6 {
	private int i = 10;
	A6 increment_I() {
		A6 a = new A6();
		a.i=a.i+1;
		return a;
	}
	A6 decrement_I() {
		A6 a = new A6();
		a.i=a.i-1;
		return a;
	}
	int get_I() {
		return i;
	}
}
public class Test6 {

	public static void main(String[] args) {
		A6 a = new A6();
		System.out.println("a: i value :"+a.get_I());
		A6 a1 = a.increment_I();
		System.out.println("a1: i value :"+a1.get_I());
		System.out.println("a: i value :"+a.get_I());
		A6 a2 = a.decrement_I();
		System.out.println("a2: i value :"+a2.get_I());
		System.out.println("a: i value :"+a.get_I());
	}

}
