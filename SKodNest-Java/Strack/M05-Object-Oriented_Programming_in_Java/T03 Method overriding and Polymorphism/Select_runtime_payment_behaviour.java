import java.util.Scanner;

class Payment {
    public void pay(int amount) {
        System.out.println("Payment " + amount);
    }
}

class CardPayment extends Payment {
    // Override pay()
    @Override
    public void pay(int amount) {
        System.out.println("Card " + amount);
    }
}

class CashPayment extends Payment {
    // Override pay()
    @Override
    public void pay(int amount) {
        System.out.println("Cash " + amount);
    }
}

public class Select_runtime_payment_behaviour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read choice and amount
        int choice = scanner.nextInt();
        int amount = scanner.nextInt();

        // Select the child objectn
        Payment p;

        // Call pay() through Payment reference
        if (choice == 1) {
            p = new CardPayment();
        } else {
            p = new CashPayment();

        }

        if (p != null) {
            p.pay(amount);
        }
    }
}