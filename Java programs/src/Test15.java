class A15 {
	int j=m2();
	int m1() {
		System.out.println("m1-A");
		return 10;
	}
	A15() {
		System.out.println("A-con");
	}
	int m2() {
		System.out.println("m2-A");
		return 10;
	}
	int i= m1();
}
public class Test15 {

	public static void main(String[] args) {
		A15 a1= new A15();
		A15 a2= new A15();
	}

}
