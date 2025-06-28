package programs_practice_062024;

public class SearchForALetter {

	public static void main(String[] args) {
		String str = "Welcome to java programming";

		char c = 'L';

		if (str.indexOf(c) != -1) {
			System.out.println("character present");
			System.out.println(c + " is present in the index number: " + str.indexOf(c) + " in the string.");
		} else {
			System.out.println("character not present");
			System.out
					.println("If " + c + " is not present in the string it should give (-1) = " + str.indexOf(c));
		}

	}

}
