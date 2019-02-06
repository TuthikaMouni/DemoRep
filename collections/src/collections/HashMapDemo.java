package collections;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("A","AAA");
		hm.put("B","BBB");
		hm.put("C","CCC");
		hm.put("D","DDD");
		hm.put("E","EEE");
		System.out.println(hm);
		hm.put("B","FFF");
		System.out.println(hm);
		hm.put("F","CCC");
		System.out.println(hm);
		hm.put(null,"GGG");
		hm.put(null,"HHH");
		hm.put("G",null);
		hm.put("H",null);
		System.out.println(hm);
		hm.put(new Integer(10),new Integer(20));
		System.out.println(hm);
	}

}
