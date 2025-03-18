package java_programs_practice_032025;

public class ReversingString {
	public static void main(String[] args) {
		String s = "ABCD";
		String a = "";
		char[] a1 = s.toCharArray();
		
		int len = a1.length;
		
		for(int i=len-1; i>=0 ; i--) {
			a = a + a1[i];
		}
		
		System.out.println(a);
	}
}
