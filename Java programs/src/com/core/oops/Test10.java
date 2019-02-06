package com.core.oops;
enum Apple {
	A(150),B(200),C(300);
	int price;
	Apple(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
}
public class Test10 {

	public static void main(String[] args) {
		System.out.println("A-grade apple   :"+Apple.A.getPrice());
		System.out.println("B-grade apple   :"+Apple.B.getPrice());
		System.out.println("C-grade apple   :"+Apple.C.getPrice());
	}

}
