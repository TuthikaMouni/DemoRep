
public class AllInOne {
	public static void main(String[] args) {
		int i = 100;
		String s = Integer.toString(i);
		Integer b = new Integer(s);
		int z = b.intValue();
		Integer c = new Integer(z);
		String d = c.toString();
		int e = Integer.parseInt(d);
		System.out.println(e);
	}
}
