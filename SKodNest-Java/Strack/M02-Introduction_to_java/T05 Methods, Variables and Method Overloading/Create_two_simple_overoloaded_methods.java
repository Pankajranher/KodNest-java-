import java.util.Scanner;

class Printer {
    void show(int number) {
        // Print the number
        System.out.println("Number: " + number);
    }

    void show(String word) {
        // Print the word
        System.out.println("Word: " + word);
    }

}

public class Create_two_simple_overoloaded_methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read one number and one word
        int number = scanner.nextInt();
        String word = scanner.next();

        // Create one Printer object
        Printer prt = new Printer();

        // Call both show() methods
        prt.show(number);
        prt.show(word);
    }
}
