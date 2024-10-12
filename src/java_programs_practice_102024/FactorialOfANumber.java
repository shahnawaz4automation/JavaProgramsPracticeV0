package java_programs_practice_102024;

public class FactorialOfANumber {
	public static void main(String[] args) {
		int num = 5;
		int factorial = 1;
		
		for(int i = 1; i<=num; i++) {
			factorial = factorial*i;
			System.out.println(factorial);
		}
	}
}
