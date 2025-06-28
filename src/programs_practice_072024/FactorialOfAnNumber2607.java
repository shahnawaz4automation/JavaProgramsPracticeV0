package programs_practice_072024;

import java.util.Scanner;

public class FactorialOfAnNumber2607 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int fact = 1;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				fact = fact *i;
			}
			System.out.println(fact);
		} else {
			System.out.println("Factorial is 1");
		}
		

	}
}
