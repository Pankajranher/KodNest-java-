import java.util.Scanner;

public class Count_spaces_in_text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int spaceCount = 0;
        char target = ' ';

        // Count spaces in the text.
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                spaceCount++;
            }
        }
        System.out.println("Spaces: " + spaceCount);

    }
}