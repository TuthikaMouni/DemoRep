package collections;
import java.util.*;
class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		StringBuffer s1 = (StringBuffer)obj1;
		StringBuffer s2 = (StringBuffer)obj2;
		int length1 = s1.length();
		int length2 = s2.length();
		int val=0;
		if(length1<length2) {
			val=-100;
		}
		else if(length1>length2) {
			val=100;
		}
		else {
			val=0;
		}
		return -val;
	}
}
public class TreeSetDemo2 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("AAA");
		StringBuffer sb2 = new StringBuffer("BB");
		StringBuffer sb3 = new StringBuffer("CCCC");
		StringBuffer sb4 = new StringBuffer("D");
		StringBuffer sb5 = new StringBuffer("EEEEE");
		MyComparator mc = new MyComparator();
		TreeSet ts = new TreeSet(mc);
		ts.add(sb1);
		ts.add(sb2);
		ts.add(sb3);
		ts.add(sb4);
		ts.add(sb5);
		System.out.println(ts);
	}
}