package moreinheritanceconcepts;

public class Child extends Parent {
	void f1() {
		super.f1();
		System.out.println("Inside the child f1()");
	}

}
