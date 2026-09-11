import java.util.Scanner;

class Remove_the_last_character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // Remove the last character and display the result.
        StringBuilder sb = new StringBuilder(text);
        int finalc = sb.length() - 1;
        System.out.println("Result: " + sb.deleteCharAt(finalc));

    }
}