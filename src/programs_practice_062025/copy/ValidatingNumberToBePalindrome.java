package programs_practice_062025.copy;

public class ValidatingNumberToBePalindrome {
	public static void main(String[] args) {
		int a = 121;
		
		String num = String.valueOf(a);
		
		StringBuffer sb = new StringBuffer();
		sb.append(num);
		StringBuffer sb1 = sb.reverse();
		int b = Integer.parseInt(String.valueOf(sb1));
		System.out.println(b);
		
		if (a==b) {
			System.out.println("Input you provided is palindrome");
		}
		else {
			System.out.println("Input you provided is not palindrome");
		}
	}
}
