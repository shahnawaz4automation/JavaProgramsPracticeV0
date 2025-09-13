package programs_practice_2025;

public class EvenOrOddNumber {
	public static void main(String[] args) {
		int a = 10;
		int b = a % 2;
		System.out.println(b);
		if (b != 0) {
			System.out.println("Number is odd");
		} else {
			System.out.println("Number is even");
		}
	}
}
