import java.util.Scanner;

public class Reverse_a_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // Create a builder, reverse it and display the result.
        StringBuilder bldr = new StringBuilder(text);
        bldr.reverse();
        String newString = bldr.toString();
        System.out.println("Reversed: " + newString);

    }
}