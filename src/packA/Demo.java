package packA;

public class Demo {
	public static void main(String[] args) {
		ClassAOne cAOne = new ClassAOne();
		System.out.println(cAOne.aOneVariable);
		cAOne.aOneMethod();
		
		ClassATwo cATwo = new ClassATwo();
		System.out.println(cATwo.aTwoVariable);
		cATwo.aTwoMethod();
	}

}
