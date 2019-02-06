interface I {
	int x = 20;//by default interface variables are public static final
	void m1();//by default interface methods are public and abstract
	void m2();
	void m3();
}
class B1 implements I {
	public void m1() {    //the implementation of interface method requires public keyword in class
		System.out.println("m1-A");
	}
	public void m2() {
		System.out.println("m2-A");
	}
	public void m3() {
		System.out.println("m3-A");
	}
	public void m4() {
		System.out.println("m4-A");
	}
}
class Test5 {

	public static void main(String[] args) {
		//I i = new I();-->Error, we can not create an object to interface
		I i = new B1();
		System.out.println(i.x);
		System.out.println(I.x);// in interface we can access variables with reference variable and interface name
		i.m1();
		i.m2();
		i.m3();
		//i.m4();-->error, reference variable i can access only interface methods
		B1 b = new B1();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		System.out.println(b.x);
		System.out.println(B1.x);//B1 class implements interface so we can access variables with class name also
	}

}
