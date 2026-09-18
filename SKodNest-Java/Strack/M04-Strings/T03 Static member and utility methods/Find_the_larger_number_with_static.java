import java.util.Scanner;

class NumberUtility {
    static int larger(int first, int second) {
        // Return the larger value.

        return Math.max(first, second);
    }
}

public class Find_the_larger_number_with_static {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers and call NumberUtility. larger().
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Larger: " + NumberUtility.larger(num1, num2));
    }
}