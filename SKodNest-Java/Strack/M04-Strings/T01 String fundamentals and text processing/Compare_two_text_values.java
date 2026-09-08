import java.util.Scanner;

public class Compare_two_text_values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstText = scanner.nextLine();
        String secondText = scanner.nextLine();

        // Compare the two values in both ways.
        boolean exactMatch = firstText.equals(secondText);
        boolean ignoreCaseMatch = firstText.equalsIgnoreCase(secondText);

        System.out.println("Exact match: " + exactMatch);
        System.out.println("Ignore-case match:" + ignoreCaseMatch);
    }
}