package java_programs_practice_072024;

public class StringPractice {

	public static void main(String[] args) {
		// String s = "welcome";
		// String s1 = new String("welcome");
		// System.out.println(s+" "+s1);

		String s = "welcome";
		System.out.println(s.length());
		System.out.println("Kulsum".length());

		String s1 = "Welcome";
		String s2 = " to learning";
		String s3 = " java";

		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2).concat(s3));
		
		String s4 = " Trimmed ";
		System.out.println(s4.trim());
		System.out.println(s4.charAt(2));
	}

}
