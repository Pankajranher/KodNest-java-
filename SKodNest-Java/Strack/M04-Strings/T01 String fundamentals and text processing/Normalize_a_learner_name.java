import java.util.Scanner;

public class Normalize_a_learner_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String learnerName = scanner.nextLine();

        // Normalize and display the name.

        String learnerName1 = learnerName.trim();

        System.out.println("Normalized name: " + learnerName1.toUpperCase());
    }
}