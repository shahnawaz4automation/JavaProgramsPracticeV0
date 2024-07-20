package packA;

public class Demo extends ClassAOne {
	
	public static void main(String[] args) {
		ClassAOne cAOne = new ClassAOne();
		System.out.println(cAOne.aOneVariable);
		cAOne.aOneMethod();
		cAOne.interfaceMethod1();
		
		ClassATwo cATwo = new ClassATwo();
		System.out.println(cATwo.aTwoVariable);
		cATwo.aTwoMethod();
		}
}
