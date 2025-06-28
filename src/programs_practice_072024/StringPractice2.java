package programs_practice_072024;

import java.util.Arrays;

public class StringPractice2 {
	public static void main(String[] args) {
		String s = "Welcome to selenium practice again and for final time";
		System.out.println(s.substring(11,19));
		String[] s1 = s.split(" ");
		
		/*
		 * System.out.println(Arrays.toString(s1)); System.out.println(s1.length);
		 * for(String s2: s1) { System.out.println(s2); }
		 */
		
		String amount = "$15,20,22";
		System.out.println(amount.replace("$", ""));
		System.out.println(amount.replace("$", "").replace(",", ""));
		
		String a1 = "abc%123@xyz";
		String arr1[] = a1.split("@");
		//System.out.println(Arrays.toString(arr1));
		String[] arr2 = arr1[0].split("%");
		
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(arr1[1]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
	}
}
