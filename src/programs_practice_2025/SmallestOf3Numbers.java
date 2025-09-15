package programs_practice_2025;

public class SmallestOf3Numbers {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		int c = 1;

		if (a == b || b == c || c == a) {
			
			System.out.println("There are 2 same variables");
		} else if (a <= b && a <= c) {
			System.out.println("a is smallest");
		} else if (b <= a && b <= c) {
			System.out.println("b is smallest");
		} else {
			System.out.println("c is smallest");
		}
	}
}
