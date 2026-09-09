import java.util.Scanner;

public class Count_a_character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char target = scanner.nextLine().charAt(0);

        int count = 0;

        // Count the target character.
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("Occurrences: " + count);

    }
}
