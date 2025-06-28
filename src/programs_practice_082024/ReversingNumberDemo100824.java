package programs_practice_082024;

public class ReversingNumberDemo100824 {
	public static void main(String[] args) {
		int a = 1234;
		StringBuffer sb = new StringBuffer(String.valueOf(a));
		StringBuffer sb1 = sb.reverse();
		int b = Integer.parseInt(sb1.toString());
		System.out.println(b);
		
		StringBuilder sb2 = new StringBuilder(String.valueOf(a));
		sb2.reverse();
		int c = Integer.parseInt(sb2.toString());
		System.out.println(c);
	}
}
