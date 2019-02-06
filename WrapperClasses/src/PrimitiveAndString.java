
public class PrimitiveAndString {

	public static void main(String[] args) {
		byte b = 100;
		String s = Byte.toString(b);
		byte x = Byte.parseByte(s);
		System.out.println(x);
	}

}
