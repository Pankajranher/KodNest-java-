import java.util.Scanner;

public class Use_simple_math_method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers and use the three Math methods.
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Maximum: " + Math.max(num1, num2));
        System.out.println("Minimum: " + Math.min(num1, num2));
        System.out.println("Absolute first: " + Math.abs(num1));
    }
}
