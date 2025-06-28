package programs_practice_072024;

public class FactorialOfaNumber {

	public static void main(String[] args) {
		int num = 4;
		int factorial = 1;
		for (int i= 1;i<=num;i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

}
