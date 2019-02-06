package collections;
import java.util.*;
public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		l1.add("E");
		System.out.println(l1);
		ListIterator lit = l1.listIterator();
		System.out.println("Elements in forward direction :");
		while(lit.hasNext()) {
			System.out.println(lit.nextIndex()+" "+lit.next());
		}
		System.out.println();
		System.out.println("Elements in backward direction :");
		while(lit.hasPrevious()) {
			System.out.println(lit.previousIndex()+" "+lit.previous());
		}
	}

}
