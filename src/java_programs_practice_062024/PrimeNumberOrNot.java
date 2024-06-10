package java_programs_practice_062024;

import java.util.Scanner;

public class PrimeNumberOrNot {
// A number is a prime number if the below 2 conditions are satisfied:
	// 1. Is > 1.
	// 2. It has only 2 factors, i.e. 1 and itself
	public static void main(String[] args) {
		int count = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.println("Prime Number");
			} else {
				System.out.println("Not a prime number");
			}

		} else {
			System.out.println("Not a prime number");
		}
	}
}
