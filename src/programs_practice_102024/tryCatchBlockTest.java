package programs_practice_102024;

public class tryCatchBlockTest {
	public static void main(String[] args) {
		int a = 10;

		try {
			System.out.println("1");
			a = a / 0;
			System.out.println("2");
		} catch (Exception e) {
			System.out.println("catch block");
		} finally {
			System.out.println("finally block");
		}
	}
}
