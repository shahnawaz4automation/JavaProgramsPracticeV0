package programs_practice_2025;

import java.util.Scanner;

public class VotingEligibility {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter age of person: ");
		int age = scan.nextInt();

		if (age >= 18) {
			System.out.println("Person is eligible to vote");
		} else {
			System.out.println("Person has to be above 18 to be eligible to vote");
		}
		
		scan.close();
	}
}
