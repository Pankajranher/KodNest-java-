import java.util.Scanner;

class OrderCalculator {
    int calculateSubtotal(int price, int quantity) {
        return price * quantity;
    }

    int calculateFinalTotal(int subtotal, int deliveryCharge) {
        // Return subtotal plus delivery charge
        return subtotal + deliveryCharge;
    }
}

class food_order_total {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int quantity = scanner.nextInt();
        int deliveryCharge = scanner.nextInt();

        // Create one OrderCalculator object
        OrderCalculator calculateorder = new OrderCalculator();

        // Call both methods
        int result = calculateorder.calculateSubtotal(price, quantity);
        int total = calculateorder.calculateFinalTotal(result, deliveryCharge);

        // Print the returned values
        System.out.println("Subtotal: " + result);
        System.out.println("Final Total: " + total);
    }
}