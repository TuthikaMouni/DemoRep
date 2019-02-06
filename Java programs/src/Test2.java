class A2 {
	static int i = 10;
	int j = 10;
}
class Test2 {

	public static void main(String[] args) {
		A2 a1 = new A2();
		System.out.println(a1.i+" "+a1.j);
		a1.i=a1.i+1;
		a1.j=a1.j+1;
		System.out.println(a1.i+" "+a1.j);
		A2 a2 = new A2();
		System.out.println(a2.i+" "+a2.j);
		a2.i=a2.i+1;
		a2.j=a2.j+1;
		System.out.println(a1.i+" "+a1.j);
		System.out.println(a2.i+" "+a2.j);
		A2 a3 = new A2();
		System.out.println(a3.i+" "+a3.j);
		a3.i=a3.i+1;
		a3.j=a3.j+1;
		System.out.println(a1.i+" "+a1.j);
		System.out.println(a2.i+" "+a2.j);
		System.out.println(a3.i+" "+a3.j);
	}

}
