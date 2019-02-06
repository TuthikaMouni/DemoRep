class A7 {
	void add(int ... a) {
		System.out.println("No of arguments :"+a.length);
		int result=0;
		System.out.print("Argument list  :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
			result=result+a[i];
		}
		System.out.println();
		System.out.println("Addition     :"+result);
	}
}
class Test7 {

	public static void main(String[] args) {
		A7 a = new A7();
		a.add();
		a.add(10);
		a.add(10,20);
		a.add(10,20,30);
	}

}
