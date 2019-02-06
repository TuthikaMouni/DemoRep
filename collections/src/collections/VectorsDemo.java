package collections;
import java.util.*;
public class VectorsDemo {

	public static void main(String[] args) {
		Vector v = new Vector(5,5);
		System.out.println(v.capacity());
		for(int i = 1;i<=6;i++) {
			v.add(i);
		}
		System.out.println(v.capacity());
		for(int i = 7;i<=11;i++) {
			v.add(i);
		}
		System.out.println(v.capacity());
	}

}
