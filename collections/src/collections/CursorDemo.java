package collections;
import java.util.*;
public class CursorDemo {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("E");
		System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
