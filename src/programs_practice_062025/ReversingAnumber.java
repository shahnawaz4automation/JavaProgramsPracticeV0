package programs_practice_062025;

public class ReversingAnumber {
	public static void main(String[] args) {
		int num = 12345;
		
		String num1 = String.valueOf(num);
		
		//using the StringBuffer
		StringBuffer sb = new StringBuffer(num1);
		StringBuffer sb1 = sb.reverse();
		System.out.println(sb1);
		
		StringBuffer sb9 = new StringBuffer();
		sb9.append(num);
		System.out.println(sb9.reverse());
		
		//using the StringBuilder
		StringBuilder sb2 = new StringBuilder(num1);
		System.out.println(sb2.reverse());
		
		
	}
}
