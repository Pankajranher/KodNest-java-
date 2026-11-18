import java.util.Scanner;

public class Debug_try_catch_finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();

        // BUG: This division can fail outside try.
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }
        // BUG: The completion message should be in finally.
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Attempt finished");

        }

    }

}