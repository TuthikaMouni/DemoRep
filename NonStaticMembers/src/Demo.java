
public class Demo {
	static Demo obj;

	static {
		System.out.println(Demo.obj);
		Demo.obj = new Demo();
	}

	public static void main(String[] args) {
		System.out.println(Demo.obj);
	}
}
