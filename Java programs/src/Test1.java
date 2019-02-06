class A1 {
	static int i = 10;
	int j = 20;
	public void m1() {
		//static int k = 30; -->Error;static variables should not be declared in local variables
		System.out.println("M1-A");
		System.out.println(this.i);
		System.out.println(this.j);
	}
}
class Test1 {

	public static void main(String[] args) {
		A1 a = new A1();
		System.out.println(a.i);
		System.out.println(A1.i);
		a.m1();
		A1 a1 = null;
		System.out.println(a1.i);
		//System.out.println(a1.j); -->NullPointerException
	}

}
