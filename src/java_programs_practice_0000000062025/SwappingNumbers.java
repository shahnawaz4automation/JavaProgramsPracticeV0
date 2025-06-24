package java_programs_practice_0000000062025;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a integer that will store in variable a: ");
		int a = scan.nextInt();
		System.out.print("Enter a integer that will store in variable b: ");
		int b = scan.nextInt();
		
		int c= a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
	}

}
