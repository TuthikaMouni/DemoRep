package com.exception.test;

import java.util.ArrayList;

class A {
	int i = 10;
}

class B extends A {
	int j = 20;
}

class C extends B {
	 int k = 30;
}

	

public class ClassCastExceptionTest {
	
	public void genNumbers() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int value = i * ((int) Math.random());
			Integer intObj = new Integer(value);
			numbers.add(intObj);
		}
		System.out.println(numbers);
	}

	public static void main(String[] args) {
		
		ClassCastExceptionTest cctest = new ClassCastExceptionTest();
		cctest.genNumbers();
		
		A a = new B(); // Class B is up casting to Class A
		B b = (B) a; // down casting 
		C c = null;
		try {
			c = (C) b; // Classcast exception
		}catch(ClassCastException e) {
			System.err.println("Error Message :"+e.getMessage());
		}
		System.out.println("test control");
		System.out.println(" K values"+c.k); //c.k = b.k or a.k
	}

}
