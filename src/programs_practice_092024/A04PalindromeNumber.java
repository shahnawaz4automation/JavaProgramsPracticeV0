package programs_practice_092024;

public class A04PalindromeNumber {

	public static void main(String[] args) {
		int num = 1234;
		int reverse_num = 4321;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		System.out.println(sb.reverse());
		
		//Logic to check the number is palindrome or not
		if (num==reverse_num) {
			{
				System.out.println("Number is palindrome");
			}
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}

}
