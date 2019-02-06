class A17 {
	int m1() {
		System.out.println("m1-A");
		return 10;
	}
	int j=m2();
	{
		System.out.println("IB-A");
	}
	A17() {
		System.out.println("A-con");
	}
	int m2() {
		System.out.println("m2-A");
		return 10;
	}
	{
		System.out.println("IB1-A");
	}
	int i=m1();
}
public class Test17 {

	public static void main(String[] args) {
		A17 a1 = new A17();
		A17 a2 = new A17();
	}

}
