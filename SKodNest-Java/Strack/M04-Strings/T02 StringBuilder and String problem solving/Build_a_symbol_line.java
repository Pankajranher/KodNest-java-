import java.util.Scanner;

public class Build_a_symbol_line {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);
        int repeatCount = Integer.parseInt(scanner.nextLine());

        StringBuilder builder = new StringBuilder();

        // Append symbol repeatCount times.
        for (int i = 0; i < repeatCount; i++) {
            builder.append(symbol);

        }

        System.out.println("Result: " + builder);
    }
}