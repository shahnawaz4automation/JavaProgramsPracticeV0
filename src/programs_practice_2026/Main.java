package programs_practice_2026;

public class Main {

	public static void main(String[] args) {
		// Create Department
		Department qa = new Department();
		qa.departmentName = "QA";
		qa.managerName = "John";
		
		// Create Employee 1
		Employee e1 = new Employee();
		e1.name = "Shahnawaz";
		e1.department = qa;
		
		// Create Employee 2
		Employee e2 = new Employee();
		e2.name = "Ali";
		e2.department = qa;
		
		// Print Employee Details
        System.out.println(e1.name);
        System.out.println(e1.department.departmentName);
        System.out.println(e1.department.managerName);

        System.out.println();

        System.out.println(e2.name);
        System.out.println(e2.department.departmentName);
        System.out.println(e2.department.managerName);
        
        // Create Employee 3
        Employee e3 = new Employee();
        e3.name = "Rahul";
        e3.department = qa;
        
        qa.managerName = "David";
        System.out.println();
        
        // Print Employee Details again
        System.out.println("Output after changing the manager");
        printEmployee(e1);
        printEmployee(e2);
        printEmployee(e3);
	}
	
	static void printEmployee(Employee e) {
		System.out.println("Employee Name : " + e.name);
		System.out.println("Department    : " + e.department.departmentName);
		System.out.println("Manager       : " + e.department.managerName);
		System.out.println("------------------------------");
	}
	

}
