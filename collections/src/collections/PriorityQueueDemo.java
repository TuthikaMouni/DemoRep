package collections;
import java.util.*;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		q.add("A");
		q.add("D");
		q.add("C");
		q.add("E");
		q.add("B");
		System.out.println(q);
		q.add("C");
		System.out.println(q);
		System.out.println(q.add(null));
	}

}
