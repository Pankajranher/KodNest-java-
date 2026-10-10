import java.util.Scanner;

class Printer {
    public void print(int value) {
        // Print Number and value
        System.out.println("Number " + value);
    }

    public void print(String value) {
        // Print Text and value
        System.out.println("Text " + value);
    }
}

class ColorPrinter extends Printer {
    // Override only print(String)
    @Override
    public void print(String value) {
        System.out.println("Color " + value);
    }
}

public class Call_overloaded_and_overriden_methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integer and word
        int inte = scanner.nextInt();
        String word = scanner.next();

        // Store ColorPrinter in Printer reference
        Printer p = new ColorPrinter();

        // Call both overloaded methods
        p.print(inte);
        p.print(word);
    }
}