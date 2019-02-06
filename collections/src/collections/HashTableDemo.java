package collections;
import java.util.*;
public class HashTableDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("A","AAA");
		hm.put("D","DDD");
		hm.put("C","CCC");
		hm.put("B","BBB");
		System.out.println(hm);
		hm.put(null,"EEE");
		hm.put(null,"CCC");
		hm.put("E",null);
		hm.put("B",null);
		System.out.println(hm);
		Hashtable ht = new Hashtable();
		ht.put("A","AAA");
		ht.put("B","BBB");
		ht.put("D","DDD");
		ht.put("C","CCC");
		System.out.println(ht);
		ht.put("E",null);
		ht.put(null,"EEE");
		System.out.println(ht);
	}

}
