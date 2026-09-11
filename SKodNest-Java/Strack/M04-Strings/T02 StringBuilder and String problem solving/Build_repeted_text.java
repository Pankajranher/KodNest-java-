import java.util.Scanner;

public class Build_repeted_text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());

        StringBuilder builder = new StringBuilder();

        // Append word repeatCount times.
        for (int i = 0; i < repeatCount; i++) {
            builder.append(word);

        }

        System.out.println("Result: " + builder);
    }
}