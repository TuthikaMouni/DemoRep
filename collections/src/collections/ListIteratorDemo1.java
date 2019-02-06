package collections;
import java.util.*;
public class ListIteratorDemo1 {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		l1.add("E");
		System.out.println(l1);
		ListIterator lit = l1.listIterator();
		while(lit.hasNext()) {
			String element = (String)lit.next();
			if(element.equals("B")) {
				lit.add("X");
			}
			if(element.equals("D")) {
				lit.set("y");
			}
			if(element.equals("E")) {
				lit.remove();
			}
		}
		System.out.println(l1);
	}

}
