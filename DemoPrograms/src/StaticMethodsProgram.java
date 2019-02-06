
public class StaticMethodsProgram {

	public static void main(String[] args) {
		System.out.println("Inside Method");
		StaticMethodsProgram.method1();
	}
	static void method1() {
		System.out.println("static method1");
	}
	static {
		System.out.println("static method2");
		StaticMethodsProgram.method1();
	}

}
