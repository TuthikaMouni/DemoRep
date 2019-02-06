package com.core.oops;
import java.util.*;
public class Test17 {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add("AAA");
		al1.add("BBB");
		al1.add("CCC");
		al1.add("DDD");
		System.out.println(al1);
		ArrayList al2 = new ArrayList(al1);
		System.out.println(al2);
	}

}
