package collections;
import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put("A","AAA");
		tm.put("D","DDD");
		tm.put("C","CCC");
		tm.put("B","BBB");
		System.out.println(tm);
		tm.put("B","EEE");
		tm.put("E","CCC");
		System.out.println(tm);
		tm.put(null,"EEE");
		tm.put("F",null);
		System.out.println(tm);
		tm.put(new Integer(10),new Integer(20));
		System.out.println(tm);
		tm.put("G",new Integer(20));
		System.out.println(tm);
	}

}
