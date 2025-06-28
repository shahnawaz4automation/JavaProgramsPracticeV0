package programs_practice_052024;

public class VariablesMethodsConstructors {
	static int a = 10;
	
	public static void sampleMethodOne() {
		int b = 20;
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void sampleMethodTwo() {
		System.out.println(a);
		//System.out.println(b);
	}
	public static void main(String[] args) {
		sampleMethodOne();
		sampleMethodTwo();
	}

}
