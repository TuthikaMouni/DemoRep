package collections;
import java.util.*;
public class SortedMapDemo1 {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put("A","AAA");
		tm.put("E","EEE");
		tm.put("B","BBB");
		tm.put("C","CCC");
		tm.put("D","DDD");
		System.out.println(tm);
		System.out.println(tm.descendingMap());
		System.out.println(tm.ceilingKey("C"));
		System.out.println(tm.higherKey("D"));
		System.out.println(tm.floorKey("D"));
		System.out.println(tm.lowerKey("D"));
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.pollLastEntry());
		System.out.println(tm);
	}

}
