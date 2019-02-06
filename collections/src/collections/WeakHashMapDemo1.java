package collections;
import java.util.*;
class B {
	B() {
		System.out.println("Object Creating");
	}
	public void finalize() {
		System.out.println("Object Destroying");
	}
}
public class WeakHashMapDemo1 {

	public static void main(String[] args) {
		B b = new B();
		b = null;
		System.gc();
	}

}
