package programs_practice_ABC062025;

import java.util.Arrays;

public class ReversingAstring {
	public static void main(String[] args) {
		String str = "abcde";
		char[] ar = str.toCharArray();

		String new_str = "";
		for (int i = ar.length - 1; i >= 0; i--) {
			new_str = new_str + ar[i];
		}

		System.out.println(new_str);
	}
}
