class A6 {
	void add(int a,int b) {
		System.out.println("Addition of a and b is : "+(a+b));
	}
}
class Test6 {

	public static void main(String[] args) {
		A6 a = new A6();
		a.add(10,20);//valid
		//a.add();-->Invalid
		//a.add(10);-->Invalid
		//a.add(10,20,30);-->Invalid
	}

}
