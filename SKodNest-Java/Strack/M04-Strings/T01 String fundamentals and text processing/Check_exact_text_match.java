import java.util.Scanner;

public class Check_exact_text_match {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expectedText = scanner.nextLine();
        String enteredText = scanner.nextLine();

        // Compare and display the result.

        System.out.println("Match: " + (expectedText.equals(enteredText)));
    }
}