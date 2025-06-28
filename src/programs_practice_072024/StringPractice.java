package programs_practice_072024;

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
		
		String s4 = "Trimmed ";
		System.out.println(s4.trim());
		System.out.println(s4.charAt(2));
		System.out.println(s4.indexOf('m'));
		
		System.out.println(s4.equalsIgnoreCase("trimmed"));
		
		String a = "a1";
		String b = "a1";
		String e = "a1";
		String c = new String("a1");
		String d = new String("a2");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println(a==b);
		System.out.println(a==e);
		System.out.println(a==c);
		System.out.println(c==d);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(c.equals(d));
		
	}

}
