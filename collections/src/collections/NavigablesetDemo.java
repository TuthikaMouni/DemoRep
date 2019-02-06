package collections;
import java.util.*;
public class NavigablesetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("D");
		ts.add("E");
		ts.add("F");
		System.out.println(ts);
		System.out.println(ts.ceiling("D"));
		System.out.println(ts.higher("D"));
		System.out.println(ts.floor("D"));
		System.out.println(ts.lower("D"));
		System.out.println(ts.descendingSet());
		ts.pollFirst();
		ts.pollLast();
		System.out.println(ts);
	}

}
