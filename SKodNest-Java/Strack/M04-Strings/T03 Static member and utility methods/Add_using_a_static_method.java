import java.util.Scanner;

class Calculator {
    static int add(int first, int second) {
        // Return the sum.
        return first + second;
    }
}

public class Add_using_a_static_method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers and call Calculator. add().
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Sum: " + Calculator.add(num1, num2));
    }
}