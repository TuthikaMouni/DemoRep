class A20 {
	void m1() {
		System.out.println("m1-A");
	}
	void m2() {
		System.out.println("m2-A");
		m1();
		this.m1();
	}
}
public class Test20 {

	public static void main(String[] args) {
		A20 a = new A20();
		a.m2();
	}

}
