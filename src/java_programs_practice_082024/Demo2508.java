package java_programs_practice_082024;

import java.util.Scanner;

public class Demo2508 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		String nextline = scan.nextLine();
		int nextname = scan.nextInt();
		
		System.out.println(name);
		System.out.println(nextline);
		System.out.println(nextname);
		
		
		int a = 10;
		int b = 20;
		
		int max_num = Math.max(a, b);
		int min_num = Math.min(a, b);
		
		System.out.println(max_num);
		System.out.println(min_num);
	}

}
