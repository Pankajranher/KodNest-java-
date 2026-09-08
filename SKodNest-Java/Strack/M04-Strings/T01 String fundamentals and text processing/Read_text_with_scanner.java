import java.util.Scanner;

public class Read_text_with_scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String learnerName = scanner.nextLine();
        String city = scanner.nextLine();

        // Display the name, city and name length.
        System.out.println("Name: " + learnerName);
        System.out.println("City: " + city);
        System.out.println("Name length: " + learnerName.length());

    }
}