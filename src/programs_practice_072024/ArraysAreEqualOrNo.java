package programs_practice_072024;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysAreEqualOrNo {

	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5,6};
		int[] a2 = {1,2,3,4,5};
		
		boolean status = Arrays.equals(a1,a2);
		
		if(status==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}

}
