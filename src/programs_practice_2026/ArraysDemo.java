package programs_practice_2026;

public class ArraysDemo{
	public static void main(String[] args){
		String[] technologies = {
			    "Java",
			    "Selenium",
			    "API",
			    "Playwright",
			    "SQL"
			};
		for(int i=0;i<technologies.length;i++) {
			System.out.println("Technology "+(i+1)+" : "+technologies[i]);
	}
	}
}
