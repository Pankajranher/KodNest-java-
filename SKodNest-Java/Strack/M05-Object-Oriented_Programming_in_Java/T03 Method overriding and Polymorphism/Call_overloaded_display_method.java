import java.util.Scanner;

class Display {
    // Create show(int)
    void show(int value) {
        System.out.println("Number " + value);

    }

    // Create show(String)
    void show(String value) {
        System.out.println("Text " + value);
    }
}

public class Call_overloaded_display_method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read both values and call both methods
        int val = scanner.nextInt();
        String str = scanner.next();

        Display d = new Display();
        d.show(val);
        d.show(str);
    }
}