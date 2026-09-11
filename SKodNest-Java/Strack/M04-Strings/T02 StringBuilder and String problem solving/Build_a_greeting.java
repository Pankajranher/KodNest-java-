import java.util.Scanner;

public class Build_a_greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String learnerName = scanner.nextLine();

        // Build and display the greeting.
        StringBuilder sb = new StringBuilder(learnerName);
        System.out.println("Hello, " + sb.append("!"));
    }
}