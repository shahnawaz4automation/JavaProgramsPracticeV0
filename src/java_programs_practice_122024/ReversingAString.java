package java_programs_practice_122024;

public class ReversingAString {
	public static void main(String[] args) {
		String str  = "ambulance";
		String rev = "";
		
		char[] a =str.toCharArray();
		
		for(int i = a.length-1; i >=0; i--) {
			rev = rev + a[i];
		}
		System.out.println("Reverse of the str is: "+ rev);
	}
}