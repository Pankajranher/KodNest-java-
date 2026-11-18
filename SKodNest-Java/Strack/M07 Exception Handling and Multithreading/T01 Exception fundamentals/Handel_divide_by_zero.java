import java.util.Scanner;

public class Handel_divide_by_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();
        // Put the division inside try.
        try {
            int division = numerator / denominator;
            System.out.println("Result: " + division);
        }
        // Catch ArithmeticException and print a friendly message.
        catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }
        // Print Finished after the try-catch.
        System.out.println("Finished");

    }
}