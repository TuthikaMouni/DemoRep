
public class StringConcat {

	public static void main(String[] args) {
		String s1 = "xyz";
		String s2 = "abc";
		System.out.println(s1 + s2);
		int a = 10, b = 20, c = 30;
		System.out.println(a + b + c);
		System.out.println(s1 + a + b + c);
		System.out.println(a + b + c + s1 + s2);
		System.out.println(a + b + s1 + c);
		System.out.println(a + s1 + b + c);
	}

}
