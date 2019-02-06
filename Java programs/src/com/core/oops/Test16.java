package com.core.oops;
import java.util.*;
public class Test16 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		System.out.println(al);
		System.out.println(al.size());
		Object[] obj=al.toArray();
		for(Object o:obj) {
			System.out.print(o+" ");
		}
		System.out.println();
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al.isEmpty());
		System.out.println(al);
	}

}
