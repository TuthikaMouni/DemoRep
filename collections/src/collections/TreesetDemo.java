package collections;
import java.util.*;
public class TreesetDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("D");
		al.add("B");
		al.add("A");
		al.add("C");
		al.add("E");
		System.out.println(al);
		TreeSet ts = new TreeSet(al);
		System.out.println(ts);
	}
}
