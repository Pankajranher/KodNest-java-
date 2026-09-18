import java.util.Scanner;

public class Find_the_maximum_with_Math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers and display Math.max().
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Maximum: " + Math.max(num1, num2));

    }
}