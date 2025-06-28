package programs_practice_122024;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "sas";
		String rev = "";

		char[] a = str.toCharArray();

		for (int i = a.length - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println("Reverse of the str is: " + rev);

		if (str.equals(rev)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}
