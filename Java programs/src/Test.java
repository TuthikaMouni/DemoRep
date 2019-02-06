class A {
	A getRef1() {
		A a = new A();
		return a;
	}
	A getRef2() {
		return this;
	}
}
class Test {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.getRef1());
		System.out.println(a.getRef1());
		System.out.println(a.getRef1());
		System.out.println(a.getRef2());
		System.out.println(a.getRef2());
		System.out.println(a.getRef2());
	}

}
