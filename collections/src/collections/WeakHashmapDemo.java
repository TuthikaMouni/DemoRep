package collections;
import java.util.*;
class A {
	public String toString() {
		return "A";
	}
}
public class WeakHashmapDemo {

	public static void main(String[] args) {
		A a1 = new A();
		HashMap hm = new HashMap();
		hm.put(a1,"AAA");
		System.out.println("HM before GC :"+hm);
		a1 = null;
		System.gc();
		System.out.println("HM after GC :"+hm);
		A a2 = new A();
		WeakHashMap whm = new WeakHashMap();
		whm.put(a2,"AAA");
		System.out.println("WHM before GC :"+whm);
		a2 = null;
		System.gc();
		System.out.println("WHM after GC :"+whm);
	}

}
