
import java.util.Scanner;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        // Store both values
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);

    }
}

public class Initialize_product_details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the product name and price
        String productName = scanner.nextLine();
        // scanner.nextLine();
        double price = scanner.nextDouble();

        // Create one Product object
        Product pr = new Product(productName, price);

        // Call display()
        pr.display();
    }
}
