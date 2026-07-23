package programs_practice_2026.arrays;

import programs_practice_2026.Employee;

public class ArraysDemo {
	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
		employees[0] = new Employee();
		employees[0].name = "Shahnawaz";
		employees[1] = new Employee();
		employees[1].name = "Ali";
		employees[2] = new Employee();
		employees[2].name = "Rahul";

		int arrayLength = employees.length;
		for (int i = 0; i < arrayLength; i++) {

			System.out.println("Employee " + (i + 1) + " : " + employees[i].name);
		}

	}
}
