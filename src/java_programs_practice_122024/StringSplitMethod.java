package java_programs_practice_122024;

public class StringSplitMethod {
	public static void main(String[] args) {
		String text = " Learning java from QAFox.com. ";
		
		String[] s = text.split("\\s");
		for (String a : s) {
			System.out.println(a);
		}
		
		System.out.println(s[1]);
		System.out.println("a"+ s[0] + "b");
		System.out.println(s[3]);
		System.out.print(s[0]);System.out.println(s[3]);
	}
}
