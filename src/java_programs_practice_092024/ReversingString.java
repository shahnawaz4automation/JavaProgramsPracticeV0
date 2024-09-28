package java_programs_practice_092024;

public class ReversingString {
	public static void main(String[] args) {
		String s = "Shahnawaz";
		char[] a =s.toCharArray();
		String s1 = "";
		
		for(int i=a.length-1; i>=0; i--) {
		s1 = s1 + a[i];
		}
		System.out.println(s1);
	}
}
