package programs_practice_032025;

import java.util.Scanner;

public class newProgram1 {
public static void main(String[] args) {
	System.out.println("shahnawaz4automation");
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Input a number between 1-7:");
	int day = scan.nextInt();
	
	switch (day) {
	case 1 : System.out.println("Sunday"); break;
	case 2 : System.out.println("Monday"); break;
	case 3 : System.out.println("Tueday"); break;
	case 4 : System.out.println("Wednesday"); break;
	case 5 : System.out.println("Thursday"); break;
	case 6 : System.out.println("Friday"); break;
	case 7 : System.out.println("Saturday"); break;
	default : System.out.println("Input only numbers 1-7");
	}
}
}
