class A12 {
	String ename;
	String eid;
	float esal;
	String econtact;
	A12() {
		ename="Mounika";
		eid="112hd";
		esal=30000.0f;
		econtact="91-9100744364";
	}
	void getEmployeeDetails() {
		System.out.println("Employee name :"+ename);
		System.out.println("Employee id   :"+eid);
		System.out.println("Employee salary:"+esal);
		System.out.println("Employee contact:"+econtact);
	}
}
public class Test12 {

	public static void main(String[] args) {
		A12 a = new A12();
		a.getEmployeeDetails();
	}

}
