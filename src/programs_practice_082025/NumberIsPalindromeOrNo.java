package programs_practice_082025;

public class NumberIsPalindromeOrNo {
	
	public static void main(String[] args) {
		int a = 121;
		String num = String.valueOf(a);
		StringBuffer sb = new StringBuffer(num);
		String num1 = String.valueOf(sb.reverse());
		int b = Integer.parseInt(num1);
		if(a==b) {
			System.out.println("Number is a palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}
}
