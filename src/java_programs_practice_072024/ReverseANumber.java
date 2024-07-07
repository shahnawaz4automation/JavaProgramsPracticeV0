package java_programs_practice_072024;

public class ReverseANumber {
public static void main(String[] args) {
	int num = 1234;
	
	String s = String.valueOf(num);
	
	//using string buffer
	StringBuffer sb = new StringBuffer(s);
	//System.out.println(sb.reverse());
	
	//using string builder
	StringBuilder sb1 = new StringBuilder();
	sb1.append(num);
	StringBuilder rev = sb1.reverse();
	
	System.out.println(rev);
}
}
