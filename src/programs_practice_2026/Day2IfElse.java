package programs_practice_2026;

public class Day2IfElse {
	public static void main(String[] args) {
		int marks = 65;

		if (marks >= 90) {
			System.out.println("Grade: A");
		} else {
			if (marks >= 65) {
				System.out.println("Grade: B");
			} else {
				System.out.println("Grade: C");
			}
		}
	}
}
