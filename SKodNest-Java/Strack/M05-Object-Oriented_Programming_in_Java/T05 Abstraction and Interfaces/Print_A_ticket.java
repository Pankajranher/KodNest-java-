import java.util.Scanner;

interface Printable {
    void print();
}

class Ticket implements Printable {
    // Add code, constructor and print()
    String code;

    Ticket(String code) {
        this.code = code;
    }

    public void print() {
        System.out.println("Ticket: " + code);

    }
}

public class Print_A_ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();
        // Create Printable reference and call print()
        Ticket t = new Ticket(code);

        Printable ref;

        ref = t;

        ref.print();
    }
}