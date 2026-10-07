import java.util.Scanner;

class Product {
    private String name;
    private int price;

    Product(String name) {
        // Call the two-argument constructor
        this(name, 100);
    }

    Product(String name, int price) {
        this.name = name;
        this.price = price;
        // Initialize fields
    }

    public void display() {
        // Print values
        System.out.println(name + " " + price);
    }
}

public class Chain_product_cunstroctor_using_this {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        String name = scanner.next();
        Product p = new Product(name);
        p.display();
    }
}