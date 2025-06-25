package java_programs_practice_0000000062025;

public class ReversingAnumber {
	public static void main(String[] args) {
		int num = 12345;
		
		String num1 = String.valueOf(num);
		
		StringBuffer sb = new StringBuffer(num1);
		StringBuffer sb1 = sb.reverse();
		System.out.println(sb1);
		
		
		
	}
}
