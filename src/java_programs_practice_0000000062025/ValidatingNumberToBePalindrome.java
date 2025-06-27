package java_programs_practice_0000000062025;

public class ValidatingNumberToBePalindrome {
	public static void main(String[] args) {
		int a = 1234;
		
		String num = String.valueOf(a);
		
		StringBuffer sb = new StringBuffer();
		sb.append(num);
		StringBuffer sb1 = sb.reverse();
		int b = Integer.parseInt(String.valueOf(sb1));
		System.out.println(b);
		
	}
}
