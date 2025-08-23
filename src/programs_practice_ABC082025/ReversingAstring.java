package programs_practice_ABC082025;

public class ReversingAstring {
	public static void main(String[] args) {
		String s = "ABC";

		char[] c = s.toCharArray();

		int length = c.length;

		String rev = "";
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + c[i];
		}
		System.out.println(rev);
	}
}
