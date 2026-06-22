package programs_practice_2026;

import java.util.Scanner;

public class A2ScannerClass {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = scan.nextInt();
		System.out.print("Enter first number: ");
		int b = scan.nextInt();
		
		int c = a + b;
		
		System.out.println("Sum of two numbers is = " + c);
	}
}
