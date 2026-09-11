import java.util.Scanner;

public class Convert_builder_into_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // Create the builder, convert it and display the String.
        StringBuilder sb = new StringBuilder(text);
        String newStr = sb.toString();
        System.out.println("String: " + newStr);
    }

}