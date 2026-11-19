import java.util.Scanner;

public class Use_scanner_with_trynresorces {
    public static void main(String[] args) {
        // Declare Scanner in the try-with-resources parentheses.
        try (Scanner sc = new Scanner(System.in)) {
            // Read n and print its square inside try.
            int n = sc.nextInt();
            System.out.println("Square: " + n * n);
        }
        // Print Input finished after the try.
        System.out.println("Input finished");

    }

}