class A9 {
	int i = 10;
	static int j = 20;
	static {
		System.out.println("SB-A");
		//System.out.println(i);-->error,static block doesn't allow non static members
		System.out.println(j);
		A9 a = new A9();
		System.out.println(a.i);
		//System.out.println(this.j);-->error,static block doesn's allow this keyword
	}
}
public class Test9 {

	public static void main(String[] args) {
		A9 a = new A9();
	}

}
