package collections;
import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		q.offer("A");
		q.offer("B");
		q.offer("C");
		q.offer("D");
		q.offer("E");
		q.offer("F");
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q);
		PriorityQueue q1 = new PriorityQueue();
		System.out.println(q1.peek());
		System.out.println(q1.element());
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q1.poll());
		System.out.println(q1.remove());
	}

}
