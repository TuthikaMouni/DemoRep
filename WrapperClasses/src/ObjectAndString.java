
public class ObjectAndString {
	public static void main(String[] args) {
		long x = 100;
		Long y = Long.valueOf(x);
		String s = Long.toString(y);
		long z = Long.valueOf(s);
		System.out.println(z);
	}
}
