package collections;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		l1.add("E");
		System.out.println(l1);
		l1.addFirst("X");
		l1.addLast("Y");
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
	}

}
