package collections;
import java.util.*;
public class SortedMapDemo {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put("B","BBB");
		tm.put("E","EEE");
		tm.put("A","AAA");
		tm.put("D","DDD");
		tm.put("C","CCC");
		System.out.println(tm);
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.headMap("D"));
		System.out.println(tm.tailMap("D"));
		System.out.println(tm.subMap("B","E"));
	}

}
