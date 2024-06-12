package java_programs_practice_062024;

public class SearchForALetter {

	public static void main(String[] args) {
		String str = "Welcome to java programming";
		
		char c = 'W';
		
		if(str.indexOf(c)==-1) {
			System.out.println("character not present");
		}
		else {
			System.out.println("character present");
		}
	}

}
