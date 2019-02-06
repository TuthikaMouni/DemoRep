class A8 {
	int i = 10;
	static int j = 20;
	static void m1() {
		System.out.println("m1-A");
		System.out.println(j);
		//System.out.println(i);--->Error, static method doesn't allow non static variables
		//System.out.println(this.j);-->Error, static method doesn't allow this keyword to allow static variables
		A8 a = new A8();
		System.out.println(a.i);
	}
	void m2() {
		System.out.println("m2-A");
		this.m1();
	}
}
public class Test8 {

	public static void main(String[] args) {
		A8 a = new A8();
		a.m1();
		a=null;
		a.m1();
		A8.m1();
	}

}
