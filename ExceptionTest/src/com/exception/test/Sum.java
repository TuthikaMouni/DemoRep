package com.exception.test;
import java.util.*;
import java.lang.*;
public class Sum {
	public int getData() {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		a = sc.nextInt();
		return a;
	}
	public static void main(String args[]) {
		Sum s1 = new Sum();
		s1.getData();
	}
}
