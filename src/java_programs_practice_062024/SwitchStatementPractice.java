package java_programs_practice_062024;

public class SwitchStatementPractice {
	public static void main(String[] args) {
		int day = 2;

		switch (day) {
		case 1:
			System.out.println("Today is monday");
			break;
		case 2:
			System.out.println("Today is tuesday");

		default:
			System.out.println("Today is some other day");
		}
	}
}
