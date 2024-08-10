package java_programs_practice_082024;

public class CountCharacterOccurence030824 {

	public static void main(String[] args) {
		String s = "Java is a programming language";
		char[] a = s.toCharArray();
		int count = 0;
		for(int i = 0; i <a.length; i++) {
			if(a[i]=='g') {
				count++;
			}
		}
		System.out.println("Added this line in github");
		System.out.println("Number of occurences of a is: "+count );
	}

}
