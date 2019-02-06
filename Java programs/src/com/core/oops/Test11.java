package com.core.oops;
enum Book {
	A(100,50),B(200,70),C(300,100);
	int no_of_pages,price;
	Book(int no_of_pages,int price) {
		this.no_of_pages=no_of_pages;
		this.price=price;
	}
	public void getBookDetails() {
		System.out.println(no_of_pages+"     "+price);
	}
}
public class Test11 {

	public static void main(String[] args) {
		System.out.println("Books price details");
		System.out.println("-----------------------");
		Book.A.getBookDetails();
		Book.B.getBookDetails();
		Book.C.getBookDetails();
	}

}
