package programs_practice_2026;

public class StringsConcept {
	
	public static void main(String[] args) {

		String a = "I am Mohammed Shahnawaz";
		System.out.println("Length of the string is: " + a.length());
		String b = "I am an Engineer";
		System.out.println("Result of addition: " + a + b);
		System.out.println("Result of concatenation: " + a.concat(b));
		System.out.println("Result of concatenation: " + b.concat(a));
		System.out.println("Result of trim: " + a.trim());
		
		System.out.println(a+b);
	}
}
