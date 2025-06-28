package programs_practice_062024;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		String s = "welcome";
		s.length();
		System.out.println(s.length());
		System.out.println("shahnawaz".length());
	
		String s1 = "welcome to";
		String s2 = "selenium";
		String s3 = "automation";
		System.out.println(s1+s2);
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2));
		
		String a = "abc";
		String b = new String("abc");
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		String c = "abc";
		String d = new String("abc");
		d=d.intern();
		
		System.out.println(c==d);
		System.out.println(c.equals(d));
		
		a.length();
		a.concat(b);
		a.trim();
		a.charAt(2);
		a.contains(b);
		a.equals(b);
		a.equalsIgnoreCase(b);
		a.replace('a', 'b');
		a.substring(0,2);
		a.toUpperCase();
		a.split(" ");
		
		
		String email = "shah4corp@gmail.com";
		String e[] = email.split("@");
		System.out.println(Arrays.toString(e));
	}
}
