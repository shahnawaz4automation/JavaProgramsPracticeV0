package programs_practice_ABC082025;

public class ReversingANumber {
	public static void main(String[] args) {
		int a = 1234;
		StringBuffer sb = new StringBuffer(String.valueOf(a));
		StringBuffer sb1 = sb.reverse();
		String a1 = sb1.toString();
		
		int b = Integer.parseInt(a1);
		
		if(a==b) {
			System.out.println("a is palindrome");
		}
		else {
			System.out.println("a is not palindrome");
		}
	}
}
