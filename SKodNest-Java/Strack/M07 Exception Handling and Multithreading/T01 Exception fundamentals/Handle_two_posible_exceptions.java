import java.util.Scanner;

public class Handle_two_posible_exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int divisor = sc.nextInt();
        int[] values = { 12, 24, 36 };
        // Try array access followed by division.
        try {
            int result = values[index] / divisor;
            System.out.println("Result: " + result);
        }
        // Catch ArrayIndexOutOfBoundsException.
        catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Invalid index");
        }
        // Catch ArithmeticException.
        catch (ArithmeticException e2) {
            System.out.println("Cannot divide by zero");
        }
        // Print Finished.
        System.out.println("Finished");

    }
}
