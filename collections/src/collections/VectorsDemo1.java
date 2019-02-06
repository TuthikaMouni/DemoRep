package collections;
import java.util.*;
public class VectorsDemo1 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");
		v.addElement("D");
		v.addElement("E");
		v.addElement("F");
		System.out.println(v);
		System.out.println(v.elementAt(2));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		v.removeElementAt(4);
		System.out.println(v);
		v.removeAllElements();
		System.out.println(v);
	}

}
