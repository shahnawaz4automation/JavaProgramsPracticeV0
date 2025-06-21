package java_programs_practice_032025;

public class newProgram2 {
public static void main(String[] args) {
	//initialization, condition, increment/decrement
	for(int i = 0; i<3; i++) {
		System.out.println(i);
	}
	
	int j = 1;
	while (j<=3) {
		System.out.println("Count: " +j);
		j++;
	}
	
	int k = 1;
	do {
		System.out.println("Value: " + k);
	    k++;
	}
	while (k<=2);
}
}
