import java.util.Scanner;

public class Reverse_one_word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        // Reverse and display the word.
        StringBuilder sb = new StringBuilder(word);
        System.out.println("Reversed: " + sb.reverse());
    }
}