import java.util.Scanner;

public class GivenNumberIsPrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		boolean primeFlag = true;
		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				primeFlag = false;
			}
		}
		if (primeFlag == true) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("It is not a prime number");
		}
	}

}
