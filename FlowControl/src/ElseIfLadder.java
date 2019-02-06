
public class ElseIfLadder {

	public static void main(String[] args) {
		int maths = 65, physics = 30, chemistry = 45;
		if (maths >= 35 && physics >= 35 && chemistry >= 35) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}
		int avg = (maths + physics + chemistry) / 3;
		if (avg >= 69) {
			System.out.println("A grade");
		} else if (avg >= 59 && avg < 69) {
			System.out.println("B grade");
		} else {
			System.out.println("C grade");
		}
	}

}
