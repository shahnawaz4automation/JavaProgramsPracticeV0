package java_programs_practice_102024;

public class StaticFinalVariableTest {
	//final int a = 10;
	static int a = 10;
	public static void variable() {
		StaticFinalVariableTest.a = 20;
		System.out.println(a);
	}
	public static void main(String[] args) {
		//StaticFinalVariableTest s = new StaticFinalVariableTest();
		StaticFinalVariableTest.variable();
	}
}
