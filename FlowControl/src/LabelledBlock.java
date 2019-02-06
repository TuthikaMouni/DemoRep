
public class LabelledBlock {

	public static void main(String[] args) {

		int x = 20;
		L1: {
			System.out.println("Block begins");
			if (x == 20) {
				break L1;
			}
			System.out.println("Block ends");
		}
		System.out.println("Outside the block");

	}

}
