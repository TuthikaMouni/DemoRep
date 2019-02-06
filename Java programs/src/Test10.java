class A10 {
	static {
		System.out.println("SB-A");
	}
	static int i = m1();
	static int m1() {
		System.out.println("m1-A");
		return 10;
	}
}
class Test10 {

	public static void main(String[] args) {
		A10 a = new A10();
	}

}
