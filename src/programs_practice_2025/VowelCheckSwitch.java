package programs_practice_2025;

import java.util.Scanner;

public class VowelCheckSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char ch = scanner.next().charAt(0);
		ch = Character.toLowerCase(ch);

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u': {
			System.out.println(ch + " is vowel");
			break;
		}
		default:
			System.out.println(ch + " is not a vowel");
		}
	}

}
