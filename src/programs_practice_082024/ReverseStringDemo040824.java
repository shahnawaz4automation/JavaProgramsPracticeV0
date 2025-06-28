package programs_practice_082024;

public class ReverseStringDemo040824 {
	public static void main(String[] args) {
		String original_string = "Welcome To Java";

		char[] c = original_string.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		for (int i = c.length-1; i >= 0; i--) {
			System.out.print(c[i]);
		}
		
		String original_string2 = "Welcome To Java";
		
	}
}
