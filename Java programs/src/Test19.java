class A19 {
	String eid;
	String ename;
	float esal;
	String eaddr;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
}
public class Test19 {

	public static void main(String[] args) {
		A19 a = new A19();
		a.setEid("E-11");
		a.setEname("Mounika");
		a.setEsal(30000.0f);
		a.setEaddr("Hyd");
		System.out.println("Employee Details");
		System.out.println("-----------------------");
		System.out.println("Employee Id                    :"+a.getEid());
		System.out.println("Employee name                  :"+a.getEname());
		System.out.println("Employee Salary                :"+a.getEsal());
		System.out.println("Employee Address               :"+a.getEaddr());
		
	}

}
