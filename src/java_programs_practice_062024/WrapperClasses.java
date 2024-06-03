package java_programs_practice_062024;

import java.util.ArrayList;

public class WrapperClasses {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		Integer ai = a;
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(ai);
		
		String numStrng = "123";
		int c =Integer.parseInt(numStrng);
		System.out.println(c);
		
	}

}
