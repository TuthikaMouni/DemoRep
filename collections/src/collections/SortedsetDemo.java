package collections;
import java.util.*;
public class SortedsetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("D");
		ts.add("E");
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("F");
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet("E"));
		System.out.println(ts.tailSet("D"));
		System.out.println(ts.subSet("B", "E"));
	}

}
