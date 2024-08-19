package java_programs_practice_082024;

import org.apache.commons.lang3.RandomStringUtils;

public class NumberPrimeOrNot {

	public static void main(String[] args) {
		int num = 4;
		int count = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
		}
		if (count == 2) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a prime number");
		}
		
		System.out.println(RandomStringUtils.randomGraph(3));
	}
}
