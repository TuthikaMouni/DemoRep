class A13 {
	int i,j,k;
	A13() {
	}
	A13(int i1) {
		i=i1;
	}
	A13(int i1,int j1) {
		i=i1;
		j=j1;
	}
	A13(int i1,int j1,int k1) {
		i=i1;
		j=j1;
		k=k1;
	}
	void add() {
		System.out.println("Addition :"+(i+j+k));
	}
}
public class Test13 {

	public static void main(String[] args) {
		A13 a1 = new A13();
		a1.add();
		A13 a2 = new A13(10);
		a2.add();
		A13 a3 = new A13(10,20);
		a3.add();
		A13 a4 = new A13(10,20,30);
		a4.add();
		
	}

}
