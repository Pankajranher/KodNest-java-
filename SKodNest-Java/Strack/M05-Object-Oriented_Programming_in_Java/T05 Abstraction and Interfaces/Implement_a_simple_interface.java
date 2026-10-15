import java.util.Scanner;

interface Printable {
    void print();
}

class Report implements Printable {
    String title;

    Report(String title) {
        // Store title
        this.title = title;
    }

    @Override
    public void print() {
        // Print title
        System.out.println("Printing: " + title);
    }
}

public class Implement_a_simple_interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.next();
        // Use a Printable reference
        Report r = new Report(title);
        Printable ref;
        ref = r;
        ref.print();

    }
}