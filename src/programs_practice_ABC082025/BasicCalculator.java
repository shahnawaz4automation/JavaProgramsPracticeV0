package programs_practice_ABC082025;

import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double a = sc.nextDouble();
		
		System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        
        System.out.println("Sum: "+ (a+b));
        System.out.println("Difference: "+ (a-b));
	}
}
