package programs_practice_2026;

public class A5Employee {
	String name;
	int employeeId;
	public A5Employee(String name, 	int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	static String companyName = "KloudGin";
	static String ceoName = "John Smith";

	void introduce() {
		System.out.println(name + " " + employeeId + " " + companyName + " " + ceoName);
	}
	static void changeCompanyName(String newName) {
		companyName = newName;
	}

	public static void main(String[] args) {
		A5Employee a1 = new A5Employee("sam",1);
		a1.introduce();
		A5Employee a2 = new A5Employee("joe",2);
		a2.introduce();
		A5Employee.changeCompanyName("A1");
		a1.introduce();
		a2.introduce();
	}
}
