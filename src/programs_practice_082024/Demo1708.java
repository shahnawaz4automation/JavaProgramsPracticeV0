package programs_practice_082024;

import java.util.Arrays;
import java.util.Collections;

public class Demo1708 {
	public static void main(String[] args) {
		Integer[] a = {1,2,3,4};
		//int b = Integer.parseInt(Arrays.toString(a));
		
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
	}
}
