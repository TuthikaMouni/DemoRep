class A18 {
	int i=10;
	int j=20;
	A18(int i,int j) {
		System.out.println("i value :"+i);
		System.out.println("j value :"+j);
		System.out.println("i value :"+this.i);
		System.out.println("j value :"+this.j);
	}
}
public class Test18 {

	public static void main(String[] args) {
		A18 a = new A18(30,40);
	}

}
