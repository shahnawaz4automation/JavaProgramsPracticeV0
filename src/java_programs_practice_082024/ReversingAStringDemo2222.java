package java_programs_practice_082024;

public class ReversingAStringDemo2222 {
	public static void main(String[] args) {
		String s = "AMBULANCE";

		char[] c = s.toCharArray();
		System.out.println(c);

		String rev_str = "";
		for (int i = c.length-1; i >= 0; i--) {
			rev_str = rev_str + c[i];
		}
		System.out.println(rev_str);

	}
}
