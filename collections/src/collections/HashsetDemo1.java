package collections;
import java.util.*;
public class HashsetDemo1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("D");
		hs.add("C");
		hs.add("E");
		hs.add("A");
		hs.add("B");
		System.out.println(hs);
		hs.add("B");
		System.out.println(hs);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
	}

}
