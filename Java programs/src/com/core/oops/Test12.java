package com.core.oops;
class Add {
	int x=10;
	int y=20;
	public void add() {
		System.out.println("Addition :"+(x+y));
	}
}
public class Test12 {

	public static void main(String[] args) {
		Add a = new Add();
		a.add();
	}

}
