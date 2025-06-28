package programs_practice_062024;

import java.util.ArrayList;

public class WrapperClasses {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		Integer ai = a;
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(ai);
		intList.add(b);
		System.out.println(intList);
		
		String numStrng = "12";
		int c =Integer.parseInt(numStrng);
		System.out.println(c);
		
	}

}
