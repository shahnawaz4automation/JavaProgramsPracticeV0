package programs_practice_072024;

public class Swapping2Numbers {
	static int a = 1;

	public static void main(String[] args) {
		Swapping2Numbers s = new Swapping2Numbers();
		s.swapNumbers(2, 3);
		
		swapNumbers(4, 123);
	}
	
	public static void swapNumbers(int a, int b) {
		int c = 0;
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping a = "+a+" and b = "+b);
	}
}
