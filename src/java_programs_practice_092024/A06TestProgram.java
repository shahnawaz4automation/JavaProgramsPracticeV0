package java_programs_practice_092024;

public class A06TestProgram {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a;
		a = b;
		b = c;
		
		System.out.println(a);
		System.out.println(b);
	}
}
