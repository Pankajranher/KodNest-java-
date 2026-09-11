import java.util.Scanner;

public class Add_a_prefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String baseText = scanner.nextLine();
        String prefix = scanner.nextLine();

        // Insert the prefix and display the result.
        StringBuilder sb = new StringBuilder(baseText);
        System.out.println("Result: " + sb.insert(0, prefix + " "));
        scanner.close();
    }
}