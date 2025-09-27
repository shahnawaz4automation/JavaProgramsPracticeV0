package programs_practice_2025;

import java.util.Scanner;

public class LuckyNumberChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number that you want to check if it is lucky: ");
		int number = scanner.nextInt();
		
		if((number % 3 == 0 || number % 7 == 0) && !(number % 3 == 0 && number % 7 == 0)) {
			System.out.println("This is lucky number");
		}
		else {
			System.out.println("Try another number");
		}
	}
}
