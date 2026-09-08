import java.util.Scanner;

public class Count_vowels_in_text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // Convert the entire string to lowercase to handle AEIOU
        text = text.toLowerCase();

        int vowelCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
        scanner.close();
    }
}
