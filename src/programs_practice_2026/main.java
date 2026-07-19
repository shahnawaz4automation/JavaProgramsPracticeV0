package programs_practice_2026;

public class main {

	public static void main(String[] args) {
		// Create Department
		Department qa = new Department();
		qa.departmentName = "Quality Assurance";
		
		// Create Employee 1
		Employee e1 = new Employee();
		e1.name = "Sam";
		e1.department = qa;
		
		// Create Employee 2
		Employee e2 = new Employee();
		e2.name = "Jason";
		e2.department = qa;
		
		// Print Employee Details
        System.out.println(e1.name);
        System.out.println(e1.department.departmentName);

        System.out.println();

        System.out.println(e2.name);
        System.out.println(e2.department.departmentName);
        
        qa.departmentName = "Quality Engineering";

        System.out.println();
        System.out.println("After Department Name Change");

        System.out.println(e1.name);
        System.out.println(e1.department.departmentName);

        System.out.println();

        System.out.println(e2.name);
        System.out.println(e2.department.departmentName);
	}

}
