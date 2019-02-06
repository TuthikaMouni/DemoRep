package collections;
import java.util.*;
public class IdentityHashMapDemo {

	public static void main(String[] args) {
		Integer in1 = new Integer(10);
		Integer in2 = new Integer(10);
		HashMap hm = new HashMap();
		hm.put(in1,"AAA");
		hm.put(in2,"BBB");
		System.out.println(hm);
		IdentityHashMap ihm = new IdentityHashMap();
		ihm.put(in1,"AAA");
		ihm.put(in2,"BBB");
		System.out.println(ihm);
		
	}

}
