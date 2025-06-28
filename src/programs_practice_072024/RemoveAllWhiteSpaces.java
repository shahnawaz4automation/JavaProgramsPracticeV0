package programs_practice_072024;

public class RemoveAllWhiteSpaces {
	static String s = "Java       Selenium          Automation                       Tester";
	
	public static void main(String[] args) {
		
		s = s.replaceAll("\\s", "");
		System.out.println(s);
		
	}
}
