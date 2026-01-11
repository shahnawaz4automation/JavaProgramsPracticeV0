package programs_practice_2025;

public class StringImmutableTest {
	public static void main(String[] args) {
		String str1 = "Hello"; // A String object is created in String pool
		String str2 = ""; // str2 points to the same object as str1
		// String str3 = new String("Java");

		str1 = str1 + " World";

		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);

		System.out.println(str1.replaceAll("\\s", ""));
		
	}
}
