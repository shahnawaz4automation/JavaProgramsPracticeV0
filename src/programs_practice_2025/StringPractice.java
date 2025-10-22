package programs_practice_2025;

import java.lang.reflect.Array;

public class StringPractice {
	public static void main(String[] args) {
		
		String s = "Sam";
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(2));
		System.out.println(s+" Bahadur");
		System.out.println(s);
		
		StringBuffer s1 = new StringBuffer("A");
		System.out.println(s1+" Bahadur");
		System.out.println(s1);

		StringBuilder s2 = new StringBuilder("A");
		System.out.println(s2+" Bahadur");
		System.out.println(s2);
		
//		int a[] = { 1, 2, 3 };
//		System.out.println(a.length);
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
	}
}
