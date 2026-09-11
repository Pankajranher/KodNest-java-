import java.util.Scanner;

public class Check_an_exact_palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        // Reverse the word, compare it and display the result.
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        String newStr = sb.toString();
        boolean pal = newStr.equals(word);
        System.out.println("Palindrome: " + pal);

    }
}