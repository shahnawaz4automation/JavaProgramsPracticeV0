package programs_practice_2026;

public class LoopDebugDemo {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Value of i = " + i);
        }
        
        String newName = DebugDemo.returnString("Shahnawazm");
        System.out.println(newName);

        System.out.println("Loop completed");
    }
}
