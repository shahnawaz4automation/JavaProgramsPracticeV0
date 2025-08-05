package programs_practice_ABC082025;

public class StringIsPalindromeOrNo {
	public static void main(String[] args) {
		String str = "mom";
		String rev_str = "";
		char[] a = str.toCharArray();
		String num = "";
		str = num;
		for (int i = a.length-1; i >=0 ; i--) {
			rev_str = rev_str +a[i];
		}
		
		System.out.println(rev_str);
		
		if(str.equals(rev_str)) {
			System.out.println("String is palindrome");
		}else  {
			System.out.println("String is not palindrome");
		}
		
		if(str==rev_str) {
			System.out.println("Both pointing to same object");
		}else {
			System.out.println("Not pointing to same object");
		}
	}
}
