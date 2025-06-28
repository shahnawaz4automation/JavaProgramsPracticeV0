package programs_practice_122024;

public class ReversingANumber {

	public static void main(String[] args) {
		int a = 1234;
		
		StringBuffer sb = new StringBuffer(String.valueOf(a));
		StringBuffer q = sb.reverse();
		System.out.println(q);
		
		StringBuilder sb1 = new StringBuilder(String.valueOf(a));
		StringBuilder sb2 = sb1.reverse();
		System.out.println(sb2);
	}

}
