package programs_practice_ABC082025;

import java.util.Scanner;

public class AverageOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input three numbers
		System.out.print("Enter first number: ");
		double a = sc.nextDouble();

		System.out.print("Enter second number: ");
		double b = sc.nextDouble();

		System.out.print("Enter third number: ");
		double c = sc.nextDouble();

		// Calculate average
		double average = (a + b + c) / 3.0;

		/*
		 * %.2f → format specifier
		 * 		 * % → start of format
		 * 		 * .2 → 2 decimal places
		 * 		 * f → floating-point number
		 */
		System.out.printf("The average is: " + average);
		System.out.println();
		System.out.printf("The average is: %.2d" , (int)average);
		System.out.println();
		System.out.printf("The average is: %.3f" , average);
		System.out.println();
		System.out.printf("The average is: %.4f" , average);
		
	}
}
