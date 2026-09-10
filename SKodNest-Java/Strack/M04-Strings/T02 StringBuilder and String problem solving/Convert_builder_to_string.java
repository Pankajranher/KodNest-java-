import java.util.Scanner;

public class Convert_builder_to_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder builder = new StringBuilder(text);

        // Append ! and convert the builder to String.
        builder.append("!");
        String newString = builder.toString();

        System.out.println("Builder: " + builder);
        System.out.println("String: " + newString);
    }
}
