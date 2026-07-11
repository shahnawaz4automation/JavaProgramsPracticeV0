package programs_practice_2025;

public class Employee {

	String name;
	String company;
	static String organization = "Sam";
	
	Employee(String name, String company) {
		this.name = name;
		this.company = company;
	}

	void introduce() {
		System.out.println("Hi, my name is " + this.name);
		System.out.println();
		System.out.println("I work at " + this.company);
	}
	
	void introduce(int a) {
		System.out.println("You gave input as: "+a);
	}

	@SuppressWarnings("null")
	public static void main(String[] args) {
		System.out.println(Employee.organization);
		Employee e = new Employee("Mohammed Shahnawaz", "KloudGin");		
		//e = null;
		e.introduce();
		e.introduce(1);
		e.organization = "new";
		System.out.println(Employee.organization);
	}
}
