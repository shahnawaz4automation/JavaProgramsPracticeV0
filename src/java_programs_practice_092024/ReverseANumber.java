package java_programs_practice_092024;

public class ReverseANumber {
	public static void main(String[] args) {
		int num = 1234;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		System.out.println(sb.reverse());
	}
}
