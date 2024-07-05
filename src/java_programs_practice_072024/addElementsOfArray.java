package java_programs_practice_072024;

import java.util.Scanner;

public class addElementsOfArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] a = { scan.nextInt(), scan.nextInt(), scan.nextInt() };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.print(sum);
	}
}
