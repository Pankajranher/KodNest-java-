import java.util.Scanner;

public class Find_an_absolute_value_with_Math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read one integer and display Math. abs().
        int num = scanner.nextInt();
        System.out.println("Absolute: " + Math.abs(num));

    }
}