
public class CommandLineArguments {

	public static void main(String[] args) {

		int length = args.length;
		if (length == 0) {
			System.out.println("No Inputs Provided");
		} else {
			System.out.println("List of Arguments");
			for (int i = 0; i < length; i++) {
				System.out.println(args[i]);
			}
		}
	}

}
