package java_programs_practice_072024;

public class WrapperClassDemo {
	public static void main(String[] args) {
        // Parsing strings to primitive types
        int intValue = Integer.parseInt("1");
        double doubleValue = Double.parseDouble("3.14");
        
        // Converting primitive types to strings
        String intString = Integer.toString(456);
        String doubleString = Double.toString(6.28);
        
        // Using valueOf to convert strings to wrapper objects
        Integer wrappedInt = Integer.valueOf("789");
        Double wrappedDouble = Double.valueOf("9.42");

        // Using comparison methods
        int comparisonResult = Integer.compare(10, 20);
        
        System.out.println("Parsed int: " + intValue);
        System.out.println("Parsed double: " + doubleValue);
        System.out.println("Int as string: " + intString);
        System.out.println("Double as string: " + doubleString);
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Comparison result: " + (comparisonResult < 0 ? "First is less" : "First is greater or equal"));
    }
}
