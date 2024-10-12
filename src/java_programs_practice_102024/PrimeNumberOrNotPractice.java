package java_programs_practice_102024;

import java.util.Scanner;

public class PrimeNumberOrNotPractice {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		int count = 0;
		
		if(num>1) {
			for(int i = 1; i<= num; i++) {
				if(num%i==0)
					count++;
			}
			if(count==2) {
				System.out.println("Hey!. Its a prime number");
			}else {
				System.out.println("Not a prime number");
			}
		}else {
			System.out.println("Not a prime number");
		}
	}
}
