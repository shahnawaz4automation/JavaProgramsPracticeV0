package programs_practice_062024;

import java.util.Arrays;

public class CheckArraysEquals16 {

	public static void main(String[] args) {
		int[] a1 = {1, 2, 3, 4, 15};
		int[] a2 = {1, 2, 3, 4, 5};
		

		// Approach1
		Boolean b = Arrays.equals(a1, a2);
		System.out.println(b);

		// Approach2
		Boolean b1 = true;
		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != a2[i]) {
					b1 = false;
				} else {
					b1 = true;
				}
			}
		}
		if(b1==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}
}
