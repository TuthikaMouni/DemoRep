package collections;
import java.util.*;
public class LinkedHashsetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("A");
		System.out.println(hs);
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("D");
		lhs.add("A");
		lhs.add("C");
		lhs.add("B");
		System.out.println(lhs);
	}

}
