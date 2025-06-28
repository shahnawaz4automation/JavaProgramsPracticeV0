package java_programs_practice_0000000062025;

import java.util.Scanner;

public class ValidatingStringToBePalindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the text: ");
		String text = scan.next();
		System.out.println("Thanks!..");
		
		int length = text.length();
		
		char[] a = text.toCharArray();
		
		String reverse = "";
		
		for (int i = length-1; i==0; i--) {
			reverse = reverse + a[i];
		}
		
		System.out.println(reverse);
	}
}
