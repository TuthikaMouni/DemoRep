package collections;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("A","AAA");
		hm.put("B","BBB");
		hm.put("C","CCC");
		hm.put("D","DDD");
		hm.put("E","EEE");
		System.out.println(hm);
		HashMap hm1 = new HashMap();
		hm1.put("X","XXX");
		hm1.put("Y","YYY");
		System.out.println(hm1);
		hm.putAll(hm1);
		System.out.println(hm);
		System.out.println(hm.get("B"));
		System.out.println(hm.remove("E"));
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		System.out.println(hm.containsKey("D"));
		System.out.println(hm.containsValue("FFF"));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
	}

}
