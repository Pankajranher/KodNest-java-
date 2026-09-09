import java.util.Scanner;

public class Find_a_word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String word = scanner.nextLine();

        // Search and display the result.
        boolean found = sentence.contains(word);
        System.out.println("Found: " + found);

    }
}
