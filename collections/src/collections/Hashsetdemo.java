package collections;
import java.util.*;
public class Hashsetdemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("D");
		hs.add("C");
		hs.add("B");
		hs.add("A");
		hs.add("E");
		System.out.println(hs);
		HashSet hs1 = new HashSet(hs);
		System.out.println(hs1);
	}

}
