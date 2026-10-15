import java.util.Scanner;

interface Switchable {
    void switchon();
}

interface Chargeable {
    void charge();
}

class Phone implements Switchable, Chargeable {
    String name;

    Phone(String name) {
        // Store name
        this.name = name;
    }

    // Implement both methods
    @Override
    public void switchon() {
        System.out.println(name + " switched on");
    }

    @Override
    public void charge() {
        System.out.println(name + " charging");
    }
}

public class Implement_two_simple_interfaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        // Create Phone and call both methods
        Phone p = new Phone(name);
        p.switchon();
        p.charge();
    }
}