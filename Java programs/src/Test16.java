class A16 {
	int i= m1();
	{
		System.out.println("IB-A");
	}
	A16() {
		System.out.println("A-con");
	}
	int m1() {
		System.out.println("m1-A");
		return 10;
	}
}
public class Test16 {

	public static void main(String[] args) {
		A16 a = new A16();
	}

}
