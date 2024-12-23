package java_programs_practice_122024;

public class ReversingANumber {

	public static void main(String[] args) {
		int a = 1234;
		
		StringBuffer sb = new StringBuffer(String.valueOf(a));
		StringBuffer q = sb.reverse();
		
		System.out.println(q);
		String s = q.toString();
		int b = Integer.parseInt(s);
		
		System.out.println(b);
		
		
	}

}
