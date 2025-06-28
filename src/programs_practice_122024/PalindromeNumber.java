package programs_practice_122024;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		//System.out.println(sb.reverse());
		int rev_num = Integer.parseInt(sb.reverse().toString());
		
		if(rev_num == num) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
		
	}

}
