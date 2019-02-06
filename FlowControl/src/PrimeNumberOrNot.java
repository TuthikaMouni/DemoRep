import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int factors = 0;
		for (int i = 1; i <= n; i++) {
			if (n % 2 == 0) {
				factors++;
			}
		}
		if (factors == 2) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("It is not a prime number");
		}
	}
}