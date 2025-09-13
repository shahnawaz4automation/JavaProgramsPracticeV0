package programs_practice_2025;

import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double a = sc.nextDouble();

		System.out.print("Enter second number: ");
		double b = sc.nextDouble();

		System.out.println("Sum: " + (a + b));
		System.out.println("Difference: " + (a - b));

		System.out.println("Product: " + (a * b));
		if (b != 0) {
			System.out.println("Quotient: " + (a / b));
			System.out.println("Remainder (a % b): " + (a % b));
		} else {
			System.out.println("Quotient: undefined (division by zero)");
			System.out.println("Remainder: undefined (division by zero)");
		}

		sc.close();
	}
}
