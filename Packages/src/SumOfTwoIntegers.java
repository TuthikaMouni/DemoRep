import java.util.Scanner;

public class SumOfTwoIntegers {

	public static void main(String[] args) {
		System.out.println("Enter two numbers:");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int sum = n1 + n2;
		System.out.println("sum is " + sum);
	}

}
