package programs_practice_2025;

import java.util.Date;

public class Calculation2309202501 {
	public static void main(String[] args) {
		System.out.println(-6+2*4);
		System.out.println((2+3)*4);
		System.out.println(9+6-3*4/2%5); // * / % + -
		String date = new Date().toString();
		System.out.println(date.replaceAll("\\s","").replaceAll("\\:", "")+"@gmail.com");
	}
}
