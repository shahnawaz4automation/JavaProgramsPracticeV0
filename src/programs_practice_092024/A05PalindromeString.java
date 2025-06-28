package programs_practice_092024;

public class A05PalindromeString {
	public static void main(String[] args) {
		String name = "ABCDCBA";
		String reverse = "";
		char[] a = name.toCharArray();
		
		for (int i=a.length-1; i>=0; i--) {
			reverse = reverse + a[i];
		}
		
		System.out.println(reverse);
		
		String original_string = "ABCDCBA";
		//Logic to check the String is palindrome or not
				if (reverse.equals(original_string)) {
					{
						System.out.println("String is palindrome");
					}
				}
				else {
					System.out.println("String is not palindrome");
				}
	}
}
