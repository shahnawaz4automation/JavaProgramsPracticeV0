package java_programs_practice_072024;

public class StringPractice3 {
	public static void main(String[] args) {
		String s = "Keep practicing the java and selenium programs.";
		
		System.out.println(s.substring(s.indexOf("java"),s.indexOf("and")-1));
		
		System.out.println(s.indexOf("python")); //gives -1 because python is not there in s
		
		String expectedText = "Java";
		if(s.indexOf(expectedText)!=-1) {
			System.out.println(expectedText + " is found");
		}else {
			System.out.println(expectedText + " is not found");
		}
		
		String[] a = s.split("a");
		for(String a1:a) {
			System.out.print(a1);
			System.out.print("\t");
			System.out.println();
		}
		try {
			
		}catch (ArithmeticException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
