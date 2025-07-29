package programs_practice_ABC082025;

public class ReversingANumber {
	static int a = 10;
	static int b = 20;
	static int c = 0;
	public static void main(String[] args) {
		c = b;
		b = a;
		a = c;
		System.out.println(a);
		System.out.println(b);
	}
}
