package programs_practice_2025;

import java.util.Scanner;

public class MultiplicationTableOfANumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i = 1; i<=10; i++) {
			System.out.println(num + " x "+ i + " = "  + (num*i));
		}
	}

}
