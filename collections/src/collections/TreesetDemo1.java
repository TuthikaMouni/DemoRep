package collections;
import java.util.*;
public class TreesetDemo1 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("D");
		System.out.println(ts);
		ts.add("C");
		System.out.println(ts);
		System.out.println(ts.add(null));
		ts.add(new Integer(10));
		ts.add(new StringBuffer("BBB"));
	}

}
