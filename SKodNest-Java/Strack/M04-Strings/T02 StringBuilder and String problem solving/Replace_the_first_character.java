import java.util.Scanner;

public class Replace_the_first_character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char replacement = scanner.nextLine().charAt(0);

        // Replace the first character and display the result.
        StringBuilder sb = new StringBuilder(text);
        sb.setCharAt(0, replacement);
        System.out.println("Result: " + sb);

    }
}