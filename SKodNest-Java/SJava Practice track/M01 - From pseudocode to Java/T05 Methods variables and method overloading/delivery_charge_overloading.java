import java.util.Scanner;

class DeliveryCalculator {
    int calculateCharge(int distance) {
        // Return the standard charge
        return distance * 5;
    }

    int calculateCharge(int distance, int expressFee) {
        // Return the express charge
        return distance * 5 + expressFee;
    }
}

public class delivery_charge_overloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int expressFee = scanner.nextInt();

        // Create one DeliveryCalculator object
        DeliveryCalculator delcal = new DeliveryCalculator();

        // Call the one-parameter overload
        delcal.calculateCharge(distance);

        // Call the two-parameter overload
        delcal.calculateCharge(distance, expressFee);

        // Print both returned charges
        System.out.println("Standard Charge: " + delcal.calculateCharge(distance));
        System.out.println("Express Charge: " + delcal.calculateCharge(distance, expressFee));
        scanner.close();

    }
}
