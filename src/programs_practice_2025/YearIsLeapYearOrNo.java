package programs_practice_2025;

import java.util.Scanner;

public class YearIsLeapYearOrNo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		boolean status = false;
		
		if(year%4==0) {
			if(year%100==0) {
			else(year%400==0) {
					status = true;
				}
			}
		}
	}
}
