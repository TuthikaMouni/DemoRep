class Employee {
	String ename="Mounika";
	String eid="11v4345";
	float esal=30000.0f;
	String eaddr="Vzm";
	String eemail="tmounika.96@gmail.com";
	String econtact="91-900744364";
	public void displayEmployeeDetails() {
		System.out.println("Employee Details");
		System.out.println("---------------------------");
		System.out.println("Employee name           :"+ename);
		System.out.println("Employee id             :"+eid);
		System.out.println("Employee salary         :"+esal);
		System.out.println("Employee Address        :"+eaddr);
		System.out.println("Employee email          :"+eemail);
		System.out.println("Employee contact number :"+econtact);
	}
}
public class Test3 {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.displayEmployeeDetails();
	}

}
