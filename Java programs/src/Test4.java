abstract class A4 {
	void m1() {
		System.out.println("m1-A");
	}
	abstract void m2();
	abstract void m3();
}
class B extends A4 {
	void m2() {
		System.out.println("m2-A");
	}
	void m3() {
		System.out.println("m3-A");
	}
	void m4() {
		System.out.println("m4-A");
	}
}
class Test4 {

	public static void main(String[] args) {
		//A4 a = new A4();-->Error, we can not create an object to the abstract class
		A4 a = new B();//upcasting
		a.m1();
		a.m2();
		a.m3();
		//a.m4();-->Error, referrence variable a can access only A4 methods
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
	}

}
