class A14 {
	int i=m1();
	A14() {
		System.out.println("A-con");
	}
	int m1() {
		System.out.println("m1-A");
		return 10;
	}
}
public class Test14 {

	public static void main(String[] args) {
		A14 a = new A14();
	}

}
