import java.util.Scanner;

class Bill {
    // Add total field, constructor and getter
    private double total;

    public Bill(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;

    }
}

class Order {
    // Store order number and create Bill internally
    private String orderNumber;
    private Bill bill;

    public Order(String orderNumber, double total) {
        this.orderNumber = orderNumber;
        this.bill = new Bill(total);
    }

    public void displayBill() {
        System.out.println("Order " + orderNumber + " bill: " + bill.getTotal());
    }

}

public class Order_has_a_bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String orderNumber = scanner.nextLine();
        double total = scanner.nextDouble();

        // Create Order and display its bill
        Order order = new Order(orderNumber, total);
        order.displayBill();

    }
}