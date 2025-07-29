package programs_practice_ABC082025;

import java.util.Scanner;

public class ValidatingStringToBePalindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the text: ");
		String text = scan.next();
		String sam = new String ("madam");
		System.out.println("Thanks!..");
		
		int length = text.length();
		
		char[] a = text.toCharArray();
		
		String reverse = "";
		
		for (int i = length-1; i>=0; i--) {
			reverse = reverse + a[i];
		}
		
		System.out.println(reverse);
		
		if (text == sam) {
			System.out.println("Address is same");
		}
		else {
			System.out.println("Address is not same");
		}
		
		if (text.equals(reverse)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
