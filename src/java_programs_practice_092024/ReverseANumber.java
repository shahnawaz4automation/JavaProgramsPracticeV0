package java_programs_practice_092024;

public class ReverseANumber {
	public static void main(String[] args) {
		int num = 12345;
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		//sb.append();
		System.out.println(sb.reverse());
		sb = sb.reverse();
		int a = Integer.parseInt(sb.toString());
		System.out.println(a);
		
		StringBuilder sb1 = new StringBuilder(String.valueOf(num));
		System.out.println(sb1.reverse());
	}
}
