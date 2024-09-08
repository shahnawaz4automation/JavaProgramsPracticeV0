package java_programs_practice_092024;

public class A03ReverseString {
	public static void main(String[] args) {
		String name = "AMBULANCE";
		String reverse = "";
		char[] a = name.toCharArray();
		
		for (int i=a.length-1; i>=0; i--) {
			reverse = reverse + a[i];
		}
		
		System.out.println(reverse);
	}
}
