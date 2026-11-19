import java.util.Scanner;

class Handle_an_exception_in_calling_method {
    static int divide(int a, int b) {
        // Return a / b; this method does not catch.
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Call divide(a, b) inside try.
        try {
            System.out.println("Result: " + divide(a, b));
        }
        // Catch ArithmeticException in main.
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        // Then print Done.
        System.out.println("Done");
    }

}