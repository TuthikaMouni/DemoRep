class A11 {
	{
		System.out.println("IB-A");
	}
	int i = m1();
	int m1() {
		System.out.println("m1-A");
		return 10;
	}
	A11() {
		System.out.println("A-Con");
	}
	static {
		System.out.println("SB-A");
	}
	static int j = m2();
	static int m2() {
		System.out.println("m2-A");
		return 20;
	}
}
public class Test11 {

	public static void main(String[] args) {
		A11 a = new A11();
		A11 a1 = new A11();
	}

}
