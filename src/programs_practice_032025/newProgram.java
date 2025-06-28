package programs_practice_032025;

import java.util.Scanner;

public class newProgram {
public static void main(String[] args) {
	/*int x = 9;
	long y = x;
	
	System.out.println(y+10);*/
	
	//StringBuffer text = new StringBuffer("Selenium Automation");
	
	String text = "Selenium Automation";
	System.out.println("Length of text is: " + text.length());
	System.out.println(text.substring(0,8));
	//System.out.println(text.toLowerCase());
	//.out.println(text.toUpperCase());
	System.out.println(text);
	boolean a = text.contains("Auto");
	if(a = true) {
		System.out.println("Auto is present in :" + text);
		
	Scanner scan = new Scanner(System.in);
	int marks = scan.nextInt();
	
	if(marks>=90) {
		System.out.println("Grade A");
		}
	else if (marks>=75) {
		System.out.println("Grade B");
	}
	else System.out.println("Fail");
	
	}
}
}
