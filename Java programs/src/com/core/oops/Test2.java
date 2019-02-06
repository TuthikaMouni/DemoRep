package com.core.oops;
public class Test2 {

	public static void main(String[] args) {
		String str = new String("abc");
		System.out.println(str);
		Exception e = new Exception("My Own  Exception");
		System.out.println(e);
		Thread t = new Thread();
		System.out.println(t);
		Integer in = new Integer(10);
		System.out.println(in);
		java.util.ArrayList al = new java.util.ArrayList();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		System.out.println(al);
	}

}
