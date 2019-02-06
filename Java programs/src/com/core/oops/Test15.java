package com.core.oops;
import java.util.*;
public class Test15 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		System.out.println(al);
		al.add(1,"X");
		System.out.println(al);
		al.add(6,"F");
		System.out.println(al);
		al.set(3, "Y");
		System.out.println(al);
		al.set(6,"Z");
		System.out.println(al.get(6));
		System.out.println(al.remove(4));
		al.add(6,"X");
		al.add(7,"Y");
		al.add(8,"Z");
		System.out.println(al);
		System.out.println(al.indexOf("X"));
		System.out.println(al.lastIndexOf("X"));
	}

}
