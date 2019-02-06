package collections;
import java.util.*;
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("A","AAA");
		hm.put("C","CCC");
		hm.put("B","BBB");
		hm.put("D","DDD");
		hm.put("E","EEE");
		System.out.println(hm);
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("A","AAA");
		lhm.put("D","DDD");
		lhm.put("C","CCC");
		lhm.put("B","BBB");
		lhm.put("E","EEE");
		System.out.println(lhm);
	}

}
