package java_programs_practice_082024;

public class FactorialOfANumber {
	public static void main(String[] args) {
		int num = 4;
		int fact = 1;
		for(int i = 1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
}
