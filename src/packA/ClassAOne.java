package packA;

public class ClassAOne implements InterfaceA {
	public int aOneVariable = 5;

	public void aOneMethod() {
		System.out.println("Inside ClassAOne method");
	}

	@Override
	public void interfaceMethod1() {
		System.out.println("Interface method");
	}
}
